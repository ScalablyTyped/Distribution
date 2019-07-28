package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTagSet extends js.Object {
  /**
    * The ID for the specified resource.
    */
  var ResourceId: js.UndefOr[TagResourceId] = js.undefined
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: js.UndefOr[TagResourceType] = js.undefined
  /**
    * The tags associated with the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ResourceTagSet {
  @scala.inline
  def apply(ResourceId: TagResourceId = null, ResourceType: TagResourceType = null, Tags: TagList = null): ResourceTagSet = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ResourceTagSet]
  }
}

