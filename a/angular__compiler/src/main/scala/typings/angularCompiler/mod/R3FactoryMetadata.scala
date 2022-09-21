package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.mod.R3ConstructorFactoryMetadata
  - typings.angularCompiler.mod.R3DelegatedFnOrClassMetadata
  - typings.angularCompiler.mod.R3ExpressionFactoryMetadata
*/
trait R3FactoryMetadata extends StObject
object R3FactoryMetadata {
  
  inline def R3ConstructorFactoryMetadata(
    internalType: Expression,
    name: String,
    target: FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): typings.angularCompiler.mod.R3ConstructorFactoryMetadata = {
    val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.R3ConstructorFactoryMetadata]
  }
  
  inline def R3DelegatedFnOrClassMetadata(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: R3FactoryDelegateType,
    internalType: Expression,
    name: String,
    target: FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): typings.angularCompiler.mod.R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.R3DelegatedFnOrClassMetadata]
  }
  
  inline def R3ExpressionFactoryMetadata(
    expression: Expression,
    internalType: Expression,
    name: String,
    target: FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): typings.angularCompiler.mod.R3ExpressionFactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.R3ExpressionFactoryMetadata]
  }
}
