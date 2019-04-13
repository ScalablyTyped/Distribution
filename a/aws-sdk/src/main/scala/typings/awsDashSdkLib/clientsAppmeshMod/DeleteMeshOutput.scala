package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMeshOutput extends js.Object {
  /**
    * The service mesh that was deleted.
    */
  var mesh: MeshData
}

object DeleteMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): DeleteMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh)
  
    __obj.asInstanceOf[DeleteMeshOutput]
  }
}

