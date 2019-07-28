package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The cluster identifier (ID) for the cluster that you are tagging. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: ClusterId
  /**
    * A list of one or more tags.
    */
  var TagList: typings.awsDashSdk.clientsCloudhsmv2Mod.TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceId: ClusterId, TagList: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagList = TagList)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

