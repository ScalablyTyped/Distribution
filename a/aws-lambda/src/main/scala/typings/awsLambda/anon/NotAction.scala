package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotAction
  extends StObject
     with StatementAction {
  
  var NotAction: String | js.Array[String]
}
object NotAction {
  
  inline def apply(NotAction: String | js.Array[String]): NotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotAction] (val x: Self) extends AnyVal {
    
    inline def setNotAction(value: String | js.Array[String]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
    
    inline def setNotActionVarargs(value: String*): Self = StObject.set(x, "NotAction", js.Array(value*))
  }
}
