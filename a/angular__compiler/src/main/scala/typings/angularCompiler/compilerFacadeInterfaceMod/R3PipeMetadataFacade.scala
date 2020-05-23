package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  var name: String
  var pipeName: String
  var pure: Boolean
  var `type`: js.Any
  var typeArgumentCount: Double
}

object R3PipeMetadataFacade {
  @scala.inline
  def apply(
    name: String,
    pipeName: String,
    pure: Boolean,
    `type`: js.Any,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadataFacade] = null
  ): R3PipeMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadataFacade]
  }
}

