package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | scala.Null
  var imports: js.Any
  var name: java.lang.String
  var providers: js.Any
  var `type`: js.Any
}

object R3InjectorMetadataFacade {
  @scala.inline
  def apply(
    imports: js.Any,
    name: java.lang.String,
    providers: js.Any,
    `type`: js.Any,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3InjectorMetadataFacade = {
    val __obj = js.Dynamic.literal(imports = imports, name = name, providers = providers)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3InjectorMetadataFacade]
  }
}

