package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | scala.Null
  var name: java.lang.String
  var pipeName: java.lang.String
  var pure: scala.Boolean
  var `type`: js.Any
}

object R3PipeMetadataFacade {
  @scala.inline
  def apply(
    name: java.lang.String,
    pipeName: java.lang.String,
    pure: scala.Boolean,
    `type`: js.Any,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3PipeMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name, pipeName = pipeName, pure = pure)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3PipeMetadataFacade]
  }
}

