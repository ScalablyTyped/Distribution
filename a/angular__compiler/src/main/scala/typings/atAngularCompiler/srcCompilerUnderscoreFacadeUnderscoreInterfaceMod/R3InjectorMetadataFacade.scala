package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  var imports: js.Array[_]
  var name: String
  var providers: js.Array[_]
  var `type`: js.Any
}

object R3InjectorMetadataFacade {
  @scala.inline
  def apply(
    imports: js.Array[_],
    name: String,
    providers: js.Array[_],
    `type`: js.Any,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3InjectorMetadataFacade = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadataFacade]
  }
}

