package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMeshOutput extends js.Object {
  /**
    * The service mesh that was deleted.
    */
  var mesh: MeshData = js.native
}

object DeleteMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): DeleteMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeshOutput]
  }
}

