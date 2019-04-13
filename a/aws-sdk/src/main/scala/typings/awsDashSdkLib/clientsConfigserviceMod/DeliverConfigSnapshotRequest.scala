package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverConfigSnapshotRequest extends js.Object {
  /**
    * The name of the delivery channel through which the snapshot is delivered.
    */
  var deliveryChannelName: ChannelName
}

object DeliverConfigSnapshotRequest {
  @scala.inline
  def apply(deliveryChannelName: ChannelName): DeliverConfigSnapshotRequest = {
    val __obj = js.Dynamic.literal(deliveryChannelName = deliveryChannelName)
  
    __obj.asInstanceOf[DeliverConfigSnapshotRequest]
  }
}

