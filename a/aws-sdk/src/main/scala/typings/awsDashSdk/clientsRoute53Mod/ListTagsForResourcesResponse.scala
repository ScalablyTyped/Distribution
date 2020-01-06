package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourcesResponse extends js.Object {
  /**
    * A list of ResourceTagSets containing tags associated with the specified resources.
    */
  var ResourceTagSets: ResourceTagSetList = js.native
}

object ListTagsForResourcesResponse {
  @scala.inline
  def apply(ResourceTagSets: ResourceTagSetList): ListTagsForResourcesResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSets = ResourceTagSets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourcesResponse]
  }
}

