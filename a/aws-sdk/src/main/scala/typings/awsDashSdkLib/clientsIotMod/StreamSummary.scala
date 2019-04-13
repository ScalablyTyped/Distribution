package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamSummary extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.undefined
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.undefined
}

object StreamSummary {
  @scala.inline
  def apply(
    description: StreamDescription = null,
    streamArn: StreamArn = null,
    streamId: StreamId = null,
    streamVersion: js.UndefOr[StreamVersion] = js.undefined
  ): StreamSummary = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (streamArn != null) __obj.updateDynamic("streamArn")(streamArn)
    if (streamId != null) __obj.updateDynamic("streamId")(streamId)
    if (!js.isUndefined(streamVersion)) __obj.updateDynamic("streamVersion")(streamVersion)
    __obj.asInstanceOf[StreamSummary]
  }
}

