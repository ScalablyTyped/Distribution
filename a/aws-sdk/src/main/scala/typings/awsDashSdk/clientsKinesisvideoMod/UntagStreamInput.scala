package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream that you want to remove tags from.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.native
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsDashSdk.clientsKinesisvideoMod.TagKeyList = js.native
}

object UntagStreamInput {
  @scala.inline
  def apply(TagKeyList: TagKeyList, StreamARN: ResourceARN = null, StreamName: StreamName = null): UntagStreamInput = {
    val __obj = js.Dynamic.literal(TagKeyList = TagKeyList.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagStreamInput]
  }
}

