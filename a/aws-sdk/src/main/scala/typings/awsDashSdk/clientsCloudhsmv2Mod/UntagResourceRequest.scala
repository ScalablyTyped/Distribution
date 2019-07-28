package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: ClusterId
  /**
    * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
    */
  var TagKeyList: typings.awsDashSdk.clientsCloudhsmv2Mod.TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceId: ClusterId, TagKeyList: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagKeyList = TagKeyList)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

