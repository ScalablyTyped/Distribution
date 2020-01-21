package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterData extends js.Object {
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The associated metadata for the virtual router.
    */
  var metadata: ResourceMetadata = js.native
  /**
    * The specifications of the virtual router.
    */
  var spec: VirtualRouterSpec = js.native
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatus = js.native
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}

object VirtualRouterData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualRouterSpec,
    status: VirtualRouterStatus,
    virtualRouterName: ResourceName
  ): VirtualRouterData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterData]
  }
}

