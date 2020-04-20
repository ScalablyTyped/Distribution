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
}

