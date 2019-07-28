package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentDeliveryDestination extends js.Object {
  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined
  /**
    * Configuration information for delivery of data set contents to Amazon S3.
    */
  var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
}

object DatasetContentDeliveryDestination {
  @scala.inline
  def apply(
    iotEventsDestinationConfiguration: IotEventsDestinationConfiguration = null,
    s3DestinationConfiguration: S3DestinationConfiguration = null
  ): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    if (iotEventsDestinationConfiguration != null) __obj.updateDynamic("iotEventsDestinationConfiguration")(iotEventsDestinationConfiguration)
    if (s3DestinationConfiguration != null) __obj.updateDynamic("s3DestinationConfiguration")(s3DestinationConfiguration)
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
}

