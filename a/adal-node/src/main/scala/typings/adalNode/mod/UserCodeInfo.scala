package typings.adalNode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCodeInfo
  extends /* x */ StringDictionary[js.Any] {
  
  var deviceCode: String = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var errorDescription: js.UndefOr[js.Any] = js.native
  
  var expiresIn: Double = js.native
  
  var interval: Double = js.native
  
  var message: String = js.native
  
  var userCode: String = js.native
  
  var verificationUrl: String = js.native
}
object UserCodeInfo {
  
  @scala.inline
  def apply(
    deviceCode: String,
    expiresIn: Double,
    interval: Double,
    message: String,
    userCode: String,
    verificationUrl: String
  ): UserCodeInfo = {
    val __obj = js.Dynamic.literal(deviceCode = deviceCode.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], verificationUrl = verificationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCodeInfo]
  }
  
  @scala.inline
  implicit class UserCodeInfoOps[Self <: UserCodeInfo] (val x: Self) extends AnyVal {
    
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
    def setDeviceCode(value: String): Self = this.set("deviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCode(value: String): Self = this.set("userCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationUrl(value: String): Self = this.set("verificationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorDescription(value: js.Any): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDescription: Self = this.set("errorDescription", js.undefined)
  }
}
