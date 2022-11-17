package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3ExpressionFactoryMetadata
  extends StObject
     with R3ConstructorFactoryMetadata {
  
  var expression: Expression
}
object R3ExpressionFactoryMetadata {
  
  inline def apply(
    expression: Expression,
    internalType: Expression,
    name: String,
    target: FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3ExpressionFactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ExpressionFactoryMetadata]
  }
  
  extension [Self <: R3ExpressionFactoryMetadata](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
