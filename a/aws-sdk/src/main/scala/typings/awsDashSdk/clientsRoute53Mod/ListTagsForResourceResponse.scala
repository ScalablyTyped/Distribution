package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A ResourceTagSet containing tags associated with the specified resource.
    */
  var ResourceTagSet: typings.awsDashSdk.clientsRoute53Mod.ResourceTagSet = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(ResourceTagSet: ResourceTagSet): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSet = ResourceTagSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

