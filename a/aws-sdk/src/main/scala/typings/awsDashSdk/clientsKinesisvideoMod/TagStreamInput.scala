package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream that you want to add the tag or tags to.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.native
  /**
    * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
    */
  var Tags: ResourceTags = js.native
}

object TagStreamInput {
  @scala.inline
  def apply(Tags: ResourceTags, StreamARN: ResourceARN = null, StreamName: StreamName = null): TagStreamInput = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStreamInput]
  }
}

