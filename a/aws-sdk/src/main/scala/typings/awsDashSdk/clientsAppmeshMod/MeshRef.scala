package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) of the service mesh.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh.
    */
  var meshName: ResourceName = js.native
}

object MeshRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName): MeshRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeshRef]
  }
}

