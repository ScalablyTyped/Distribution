package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The ARN of the signaling channel from which you want to remove tags.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisvideoMod.ResourceARN = js.native
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsDashSdk.clientsKinesisvideoMod.TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

