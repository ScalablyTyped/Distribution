package typings.angularCompiler.compilerFacadeInterfaceMod

import typings.angularCompiler.angularCompilerStrings.directiveInject
import typings.angularCompiler.angularCompilerStrings.inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3FactoryDefMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  var injectFn: directiveInject | inject
  var name: String
  var target: R3FactoryTarget
  var `type`: js.Any
  var typeArgumentCount: Double
}

object R3FactoryDefMetadataFacade {
  @scala.inline
  def apply(
    injectFn: directiveInject | inject,
    name: String,
    target: R3FactoryTarget,
    `type`: js.Any,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3FactoryDefMetadataFacade = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryDefMetadataFacade]
  }
}

