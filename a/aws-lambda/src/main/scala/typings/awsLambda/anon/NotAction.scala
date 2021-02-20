package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import org.scalablytyped.runtime.StObject
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
  implicit class NotActionMutableBuilder[Self <: NotAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotAction(value: String | js.Array[String]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotActionVarargs(value: String*): Self = StObject.set(x, "NotAction", js.Array(value :_*))
  }
}
