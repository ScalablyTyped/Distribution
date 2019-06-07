package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ID of the resource to add a tag to.
    */
  var ResourceId: TaggableResourceId
  /**
    * The tag to add to the specified resource.
    */
  var Tags: awsDashSdkLib.clientsOrganizationsMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceId: TaggableResourceId, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

