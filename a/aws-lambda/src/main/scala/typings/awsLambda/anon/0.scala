package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.StatementAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StatementAction {
  
  var Action: String | js.Array[String] = js.native
}
object `0` {
  
  @scala.inline
  def apply(Action: String | js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String | js.Array[String]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: String*): Self = StObject.set(x, "Action", js.Array(value :_*))
  }
}
