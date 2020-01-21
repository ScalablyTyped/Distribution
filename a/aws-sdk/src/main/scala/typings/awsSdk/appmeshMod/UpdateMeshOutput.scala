package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMeshOutput extends js.Object {
  var mesh: MeshData = js.native
}

object UpdateMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): UpdateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMeshOutput]
  }
}

