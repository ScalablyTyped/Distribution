package typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import typings.atAngularCompiler.atAngularCompilerStrings.invalid
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression
  var delegateType: Factory
}

object R3DelegatedFactoryMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateType: Factory,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3DelegatedFactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFactoryMetadata]
  }
}

