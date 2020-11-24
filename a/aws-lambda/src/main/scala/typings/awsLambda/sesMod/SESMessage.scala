package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESMessage extends js.Object {
  
  var mail: SESMail = js.native
  
  var receipt: SESReceipt = js.native
}
object SESMessage {
  
  @scala.inline
  def apply(mail: SESMail, receipt: SESReceipt): SESMessage = {
    val __obj = js.Dynamic.literal(mail = mail.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMessage]
  }
  
  @scala.inline
  implicit class SESMessageOps[Self <: SESMessage] (val x: Self) extends AnyVal {
    
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
    def setMail(value: SESMail): Self = this.set("mail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt(value: SESReceipt): Self = this.set("receipt", value.asInstanceOf[js.Any])
  }
}
