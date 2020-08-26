package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderDescriptor[T /* <: Shader */] extends js.Object {
  var Shader: ShaderConstructor[T] = js.native
  var schema: Schema_[js.Object] = js.native
}

object ShaderDescriptor {
  @scala.inline
  def apply[/* <: typings.aframe.mod.Shader */ T](Shader: ShaderConstructor[T], schema: Schema_[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal(Shader = Shader.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
  @scala.inline
  implicit class ShaderDescriptorOps[Self <: ShaderDescriptor[_], /* <: typings.aframe.mod.Shader */ T] (val x: Self with ShaderDescriptor[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShader(value: ShaderConstructor[T]): Self = this.set("Shader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: Schema_[js.Object]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

