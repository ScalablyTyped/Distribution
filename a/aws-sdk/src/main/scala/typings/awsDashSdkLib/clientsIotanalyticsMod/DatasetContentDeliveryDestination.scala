package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentDeliveryDestination extends js.Object {
  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined
}

object DatasetContentDeliveryDestination {
  @scala.inline
  def apply(iotEventsDestinationConfiguration: IotEventsDestinationConfiguration = null): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    if (iotEventsDestinationConfiguration != null) __obj.updateDynamic("iotEventsDestinationConfiguration")(iotEventsDestinationConfiguration)
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
}

