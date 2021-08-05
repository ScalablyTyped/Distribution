package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralFactory extends StObject {
  
  var literalFactory: typings.angularCompiler.outputAstMod.Expression
  
  var literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression]
}
object LiteralFactory {
  
  inline def apply(
    literalFactory: typings.angularCompiler.outputAstMod.Expression,
    literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
  
  extension [Self <: LiteralFactory](x: Self) {
    
    inline def setLiteralFactory(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "literalFactory", value.asInstanceOf[js.Any])
    
    inline def setLiteralFactoryArguments(value: js.Array[typings.angularCompiler.outputAstMod.Expression]): Self = StObject.set(x, "literalFactoryArguments", value.asInstanceOf[js.Any])
    
    inline def setLiteralFactoryArgumentsVarargs(value: typings.angularCompiler.outputAstMod.Expression*): Self = StObject.set(x, "literalFactoryArguments", js.Array(value :_*))
  }
}
