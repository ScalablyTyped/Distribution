package typings.angularCompiler.anon

import typings.angularCompiler.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralFactory extends StObject {
  
  var literalFactory: Expression
  
  var literalFactoryArguments: js.Array[Expression]
}
object LiteralFactory {
  
  inline def apply(literalFactory: Expression, literalFactoryArguments: js.Array[Expression]): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
  
  extension [Self <: LiteralFactory](x: Self) {
    
    inline def setLiteralFactory(value: Expression): Self = StObject.set(x, "literalFactory", value.asInstanceOf[js.Any])
    
    inline def setLiteralFactoryArguments(value: js.Array[Expression]): Self = StObject.set(x, "literalFactoryArguments", value.asInstanceOf[js.Any])
    
    inline def setLiteralFactoryArgumentsVarargs(value: Expression*): Self = StObject.set(x, "literalFactoryArguments", js.Array(value*))
  }
}
