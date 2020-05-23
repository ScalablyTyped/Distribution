package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression
  var delegateType: Factory
}

object R3DelegatedFactoryMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    internalType: Expression,
    name: String,
    target: R3FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3DelegatedFactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFactoryMetadata]
  }
}

