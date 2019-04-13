package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceRequest extends js.Object {
  /**
    * The name of the new resource.
    */
  var Name: ResourceName
  /**
    * The identifier associated with the organization for which the resource is created.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The type of the new resource. The available types are equipment and room.
    */
  var Type: ResourceType
}

object CreateResourceRequest {
  @scala.inline
  def apply(Name: ResourceName, OrganizationId: OrganizationId, Type: ResourceType): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name, OrganizationId = OrganizationId, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateResourceRequest]
  }
}

