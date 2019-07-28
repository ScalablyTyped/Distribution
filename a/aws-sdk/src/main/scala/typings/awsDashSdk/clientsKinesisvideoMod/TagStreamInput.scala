package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream that you want to add the tag or tags to.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.undefined
  /**
    * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
    */
  var Tags: ResourceTags
}

object TagStreamInput {
  @scala.inline
  def apply(Tags: ResourceTags, StreamARN: ResourceARN = null, StreamName: StreamName = null): TagStreamInput = {
    val __obj = js.Dynamic.literal(Tags = Tags)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[TagStreamInput]
  }
}

