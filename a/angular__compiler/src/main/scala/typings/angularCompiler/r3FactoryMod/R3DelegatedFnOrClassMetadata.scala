package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFnOrClassMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression
  var delegateDeps: js.Array[R3DependencyMetadata]
  var delegateType: Class | Function
}

object R3DelegatedFnOrClassMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: Class | Function,
    injectFn: ExternalReference,
    internalType: Expression,
    name: String,
    target: R3FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
  }
}

