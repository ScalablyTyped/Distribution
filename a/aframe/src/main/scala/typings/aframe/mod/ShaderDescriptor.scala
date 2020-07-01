package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDescriptor[T /* <: Shader */] extends js.Object {
  var Shader: ShaderConstructor[T]
  var schema: Schema_[js.Object]
}

object ShaderDescriptor {
  @scala.inline
  def apply[/* <: typings.aframe.mod.Shader */ T](Shader: ShaderConstructor[T], schema: Schema_[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal(Shader = Shader.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
}

