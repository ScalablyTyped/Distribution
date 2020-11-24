package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationResponse extends js.Object {
  
  /**
    * The SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplication] = js.native
}
object GetSipMediaApplicationResponse {
  
  @scala.inline
  def apply(): GetSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationResponse]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationResponseOps[Self <: GetSipMediaApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSipMediaApplication(value: SipMediaApplication): Self = this.set("SipMediaApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplication: Self = this.set("SipMediaApplication", js.undefined)
  }
}
