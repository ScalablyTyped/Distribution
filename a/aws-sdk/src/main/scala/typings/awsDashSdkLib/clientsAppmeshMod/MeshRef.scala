package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) of the service mesh.
    */
  var arn: Arn
  /**
    * The name of the service mesh.
    */
  var meshName: ResourceName
}

object MeshRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName): MeshRef = {
    val __obj = js.Dynamic.literal(arn = arn, meshName = meshName)
  
    __obj.asInstanceOf[MeshRef]
  }
}

