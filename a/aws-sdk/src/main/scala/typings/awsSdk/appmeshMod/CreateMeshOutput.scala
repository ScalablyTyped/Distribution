package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeshOutput extends js.Object {
  /**
    * The full description of your service mesh following the create call.
    */
  var mesh: MeshData = js.native
}

object CreateMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): CreateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeshOutput]
  }
  @scala.inline
  implicit class CreateMeshOutputOps[Self <: CreateMeshOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMesh(value: MeshData): Self = this.set("mesh", value.asInstanceOf[js.Any])
  }
  
}

