package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamProcessorResponse extends js.Object {
  /**
    * ARN for the newly create stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.StreamProcessorArn] = js.undefined
}

object CreateStreamProcessorResponse {
  @scala.inline
  def apply(StreamProcessorArn: StreamProcessorArn = null): CreateStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    if (StreamProcessorArn != null) __obj.updateDynamic("StreamProcessorArn")(StreamProcessorArn)
    __obj.asInstanceOf[CreateStreamProcessorResponse]
  }
}

