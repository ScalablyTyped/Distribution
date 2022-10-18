package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression extends StObject {
  
  var ExpressionName: StandardName
  
  var ExpressionValue: typings.awsSdk.clientsCloudsearchMod.ExpressionValue
}
object Expression {
  
  inline def apply(ExpressionName: StandardName, ExpressionValue: ExpressionValue): Expression = {
    val __obj = js.Dynamic.literal(ExpressionName = ExpressionName.asInstanceOf[js.Any], ExpressionValue = ExpressionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  extension [Self <: Expression](x: Self) {
    
    inline def setExpressionName(value: StandardName): Self = StObject.set(x, "ExpressionName", value.asInstanceOf[js.Any])
    
    inline def setExpressionValue(value: ExpressionValue): Self = StObject.set(x, "ExpressionValue", value.asInstanceOf[js.Any])
  }
}
