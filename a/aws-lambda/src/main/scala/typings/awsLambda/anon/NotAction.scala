package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotAction extends StatementAction {
  
  var NotAction: String | js.Array[String] = js.native
}
object NotAction {
  
  @scala.inline
  def apply(NotAction: String | js.Array[String]): NotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAction]
  }
  
  @scala.inline
  implicit class NotActionOps[Self <: NotAction] (val x: Self) extends AnyVal {
    
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
    def setNotActionVarargs(value: String*): Self = this.set("NotAction", js.Array(value :_*))
    
    @scala.inline
    def setNotAction(value: String | js.Array[String]): Self = this.set("NotAction", value.asInstanceOf[js.Any])
  }
}
