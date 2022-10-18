package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperation extends StObject {
  
  /**
    * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in the dataset.
    */
  var ConditionExpression: Expression
}
object FilterOperation {
  
  inline def apply(ConditionExpression: Expression): FilterOperation = {
    val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperation]
  }
  
  extension [Self <: FilterOperation](x: Self) {
    
    inline def setConditionExpression(value: Expression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
  }
}
