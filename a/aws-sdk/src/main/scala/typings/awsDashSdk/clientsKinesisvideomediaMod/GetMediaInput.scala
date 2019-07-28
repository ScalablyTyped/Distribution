package typings.awsDashSdk.clientsKinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMediaInput extends js.Object {
  /**
    * Identifies the starting chunk to get from the specified stream. 
    */
  var StartSelector: typings.awsDashSdk.clientsKinesisvideomediaMod.StartSelector
  /**
    * The ARN of the stream from where you want to get the media content. If you don't specify the streamARN, you must specify the streamName.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The Kinesis video stream name from where you want to get the media content. If you don't specify the streamName, you must specify the streamARN.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideomediaMod.StreamName] = js.undefined
}

object GetMediaInput {
  @scala.inline
  def apply(StartSelector: StartSelector, StreamARN: ResourceARN = null, StreamName: StreamName = null): GetMediaInput = {
    val __obj = js.Dynamic.literal(StartSelector = StartSelector)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[GetMediaInput]
  }
}

