package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with StatementAction {
  
  var Action: String | js.Array[String]
}
object `0` {
  
  inline def apply(Action: String | js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String | js.Array[String]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value*))
  }
}
