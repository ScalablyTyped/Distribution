package typings
package atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | scala.Null
  var imports: js.Array[_]
  var name: java.lang.String
  var providers: js.Array[_]
  var `type`: js.Any
}

object R3InjectorMetadataFacade {
  @scala.inline
  def apply(
    imports: js.Array[_],
    name: java.lang.String,
    providers: js.Array[_],
    `type`: js.Any,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3InjectorMetadataFacade = {
    val __obj = js.Dynamic.literal(imports = imports, name = name, providers = providers)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3InjectorMetadataFacade]
  }
}

