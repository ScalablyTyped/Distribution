package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
  var delegate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var delegateType: R3FactoryDelegateType
}

object R3DelegatedFactoryMetadata {
  @scala.inline
  def apply(
    delegate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    delegateType: R3FactoryDelegateType,
    injectFn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    name: java.lang.String,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[R3DependencyMetadata] = null
  ): R3DelegatedFactoryMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate, delegateType = delegateType, injectFn = injectFn, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3DelegatedFactoryMetadata]
  }
}

