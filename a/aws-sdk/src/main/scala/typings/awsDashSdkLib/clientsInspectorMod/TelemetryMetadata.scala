package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryMetadata extends js.Object {
  /**
    * The count of messages that the agent sends to the Amazon Inspector service.
    */
  var count: Long
  /**
    * The data size of messages that the agent sends to the Amazon Inspector service.
    */
  var dataSize: js.UndefOr[Long] = js.undefined
  /**
    * A specific type of behavioral data that is collected by the agent.
    */
  var messageType: MessageType
}

object TelemetryMetadata {
  @scala.inline
  def apply(count: Long, messageType: MessageType, dataSize: js.UndefOr[Long] = js.undefined): TelemetryMetadata = {
    val __obj = js.Dynamic.literal(count = count, messageType = messageType)
    if (!js.isUndefined(dataSize)) __obj.updateDynamic("dataSize")(dataSize)
    __obj.asInstanceOf[TelemetryMetadata]
  }
}

