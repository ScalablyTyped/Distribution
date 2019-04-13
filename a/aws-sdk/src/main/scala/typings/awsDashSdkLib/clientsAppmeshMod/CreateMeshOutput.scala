package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMeshOutput extends js.Object {
  /**
    * The full description of your service mesh following the create call.
    */
  var mesh: MeshData
}

object CreateMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): CreateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh)
  
    __obj.asInstanceOf[CreateMeshOutput]
  }
}

