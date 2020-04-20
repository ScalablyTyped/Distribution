package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMeshOutput extends js.Object {
  /**
    * The full description of your service mesh.
    */
  var mesh: MeshData = js.native
}

object DescribeMeshOutput {
  @scala.inline
  def apply(mesh: MeshData): DescribeMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMeshOutput]
  }
}

