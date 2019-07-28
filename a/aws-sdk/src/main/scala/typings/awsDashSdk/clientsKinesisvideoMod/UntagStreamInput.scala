package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream that you want to remove tags from.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.undefined
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsDashSdk.clientsKinesisvideoMod.TagKeyList
}

object UntagStreamInput {
  @scala.inline
  def apply(TagKeyList: TagKeyList, StreamARN: ResourceARN = null, StreamName: StreamName = null): UntagStreamInput = {
    val __obj = js.Dynamic.literal(TagKeyList = TagKeyList)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[UntagStreamInput]
  }
}

