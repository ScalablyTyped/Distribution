package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderedPhoneNumber extends js.Object {
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.native
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.native
}
object OrderedPhoneNumber {
  
  @scala.inline
  def apply(): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
  
  @scala.inline
  implicit class OrderedPhoneNumberOps[Self <: OrderedPhoneNumber] (val x: Self) extends AnyVal {
    
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
    def setE164PhoneNumber(value: E164PhoneNumber): Self = this.set("E164PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteE164PhoneNumber: Self = this.set("E164PhoneNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: OrderedPhoneNumberStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
