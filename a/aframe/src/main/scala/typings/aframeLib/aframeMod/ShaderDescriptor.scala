package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDescriptor[T /* <: Shader */] extends js.Object {
  var Shader: ShaderConstructor[T]
  var schema: Schema[js.Object]
}

object ShaderDescriptor {
  @scala.inline
  def apply[T /* <: Shader */](Shader: ShaderConstructor[T], schema: Schema[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shader")(Shader)
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
}

