package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVError extends js.Object {
  
  /** The error code. */
  var code: String = js.native
  
  /** A string containing the description of the error. */
  var description: String = js.native
  
  /**
    * A string containing the error domain.
    *
    * The predefined error domains:
    * NSPOSIXErrorDomain - POSIX/BSD errors
    * NSOSStatusErrorDomain - OS X/Carbon errors
    * NSMachErrorDomain - Mach errors
    * */
  var domain: String = js.native
  
  /**
    * The user info dictionary.
    *
    * These keys may exist in the user info dictionary:
    * NSLocalizedDesciptionKey
    * NSFilePathErrorKey
    * NSStringEncodingErrorKey
    * NSUnderlyingErrorKey
    * NSURLErrorKey
    * NSLocalizedFailureReasonErrorKey
    * NSLocalizedRecoverySuggestionErrorKey
    * NSLocalizedRecoveryOptionsErrorKey
    * NSRecoveryAttempterErrorKey
    * NSHelpAnchorErrorKey
    * NSURLErrorFailingURLErrorKey
    * NSURLErrorFailingURLStringErrorKey
    * NSURLErrorFailingURLPeerTrustErrorKey
    * */
  var userInfo: js.Any = js.native
}
object TVError {
  
  @scala.inline
  def apply(code: String, description: String, domain: String, userInfo: js.Any): TVError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVError]
  }
  
  @scala.inline
  implicit class TVErrorOps[Self <: TVError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
