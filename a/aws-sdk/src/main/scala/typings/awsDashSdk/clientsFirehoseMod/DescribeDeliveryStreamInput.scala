package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
  /**
    * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one destination per delivery stream.
    */
  var ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.undefined
  /**
    * The limit on the number of destinations to return. You can have one destination per delivery stream.
    */
  var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
}

object DescribeDeliveryStreamInput {
  @scala.inline
  def apply(
    DeliveryStreamName: DeliveryStreamName,
    ExclusiveStartDestinationId: DestinationId = null,
    Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
  ): DescribeDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName)
    if (ExclusiveStartDestinationId != null) __obj.updateDynamic("ExclusiveStartDestinationId")(ExclusiveStartDestinationId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[DescribeDeliveryStreamInput]
  }
}

