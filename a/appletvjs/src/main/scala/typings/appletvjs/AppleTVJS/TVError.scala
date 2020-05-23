package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVError extends js.Object {
  /** The error code. */
  var code: String
  /** A string containing the description of the error. */
  var description: String
  /**
    * A string containing the error domain.
    *
    * The predefined error domains:
    * NSPOSIXErrorDomain - POSIX/BSD errors
    * NSOSStatusErrorDomain - OS X/Carbon errors
    * NSMachErrorDomain - Mach errors
    * */
  var domain: String
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
  var userInfo: js.Any
}

object TVError {
  @scala.inline
  def apply(code: String, description: String, domain: String, userInfo: js.Any): TVError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVError]
  }
}

