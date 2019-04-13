package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterData extends js.Object {
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  /**
    * The associated metadata for the virtual router.
    */
  var metadata: ResourceMetadata
  /**
    * The specifications of the virtual router.
    */
  var spec: VirtualRouterSpec
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatus
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName
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
    val __obj = js.Dynamic.literal(meshName = meshName, metadata = metadata, spec = spec, status = status, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[VirtualRouterData]
  }
}

