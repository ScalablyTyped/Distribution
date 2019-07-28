package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMeshOutput extends js.Object {
  /**
    * The full description of your service mesh.
    */
  var mesh: MeshData
}

object DescribeMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): DescribeMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh)
  
    __obj.asInstanceOf[DescribeMeshOutput]
  }
}

