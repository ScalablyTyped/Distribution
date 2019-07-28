package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryChannelStatus extends js.Object {
  /**
    * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
    */
  var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
  /**
    * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
    */
  var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
  /**
    * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS topic.
    */
  var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined
  /**
    * The name of the delivery channel.
    */
  var name: js.UndefOr[String] = js.undefined
}

object DeliveryChannelStatus {
  @scala.inline
  def apply(
    configHistoryDeliveryInfo: ConfigExportDeliveryInfo = null,
    configSnapshotDeliveryInfo: ConfigExportDeliveryInfo = null,
    configStreamDeliveryInfo: ConfigStreamDeliveryInfo = null,
    name: String = null
  ): DeliveryChannelStatus = {
    val __obj = js.Dynamic.literal()
    if (configHistoryDeliveryInfo != null) __obj.updateDynamic("configHistoryDeliveryInfo")(configHistoryDeliveryInfo)
    if (configSnapshotDeliveryInfo != null) __obj.updateDynamic("configSnapshotDeliveryInfo")(configSnapshotDeliveryInfo)
    if (configStreamDeliveryInfo != null) __obj.updateDynamic("configStreamDeliveryInfo")(configStreamDeliveryInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeliveryChannelStatus]
  }
}

