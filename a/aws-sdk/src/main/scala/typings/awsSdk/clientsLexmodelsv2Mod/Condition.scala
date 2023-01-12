package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The expression string that is evaluated. 
    */
  var expressionString: ConditionExpression
}
object Condition {
  
  inline def apply(expressionString: ConditionExpression): Condition = {
    val __obj = js.Dynamic.literal(expressionString = expressionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setExpressionString(value: ConditionExpression): Self = StObject.set(x, "expressionString", value.asInstanceOf[js.Any])
  }
}
