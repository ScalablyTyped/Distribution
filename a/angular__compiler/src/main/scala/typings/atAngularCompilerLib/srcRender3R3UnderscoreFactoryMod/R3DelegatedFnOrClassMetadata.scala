package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFnOrClassMetadata extends R3ConstructorFactoryMetadata {
  var delegate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var delegateDeps: js.Array[R3DependencyMetadata]
  var delegateType: R3FactoryDelegateType
}

object R3DelegatedFnOrClassMetadata {
  @scala.inline
  def apply(
    delegate: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: R3FactoryDelegateType,
    injectFn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    name: java.lang.String,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[R3DependencyMetadata] | atAngularCompilerLib.atAngularCompilerLibStrings.invalid = null
  ): R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate, delegateDeps = delegateDeps, delegateType = delegateType, injectFn = injectFn, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
  }
}

