package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Participant extends js.Object {
  
  /**
    * The participant's phone number.
    */
  var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  
  /**
    * The participant's proxy phone number.
    */
  var ProxyPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
}
object Participant {
  
  @scala.inline
  def apply(): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
    
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
    def setPhoneNumber(value: E164PhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
    
    @scala.inline
    def setProxyPhoneNumber(value: E164PhoneNumber): Self = this.set("ProxyPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyPhoneNumber: Self = this.set("ProxyPhoneNumber", js.undefined)
  }
}
