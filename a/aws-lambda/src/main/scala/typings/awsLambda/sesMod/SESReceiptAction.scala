package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESReceiptAction extends js.Object {
  
  var functionArn: String = js.native
  
  var invocationType: String = js.native
  
  var `type`: String = js.native
}
object SESReceiptAction {
  
  @scala.inline
  def apply(functionArn: String, invocationType: String, `type`: String): SESReceiptAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESReceiptAction]
  }
  
  @scala.inline
  implicit class SESReceiptActionOps[Self <: SESReceiptAction] (val x: Self) extends AnyVal {
    
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
    def setFunctionArn(value: String): Self = this.set("functionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationType(value: String): Self = this.set("invocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
