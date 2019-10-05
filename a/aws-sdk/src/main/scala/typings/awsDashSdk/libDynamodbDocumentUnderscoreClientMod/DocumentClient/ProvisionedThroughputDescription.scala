package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputDescription extends js.Object {
  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var LastDecreaseDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var LastIncreaseDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent ReadCapacityUnits per second.
    */
  var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
}

object ProvisionedThroughputDescription {
  @scala.inline
  def apply(
    LastDecreaseDateTime: _Date = null,
    LastIncreaseDateTime: _Date = null,
    NumberOfDecreasesToday: Int | scala.Double = null,
    ReadCapacityUnits: Int | scala.Double = null,
    WriteCapacityUnits: Int | scala.Double = null
  ): ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime)
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime)
    if (NumberOfDecreasesToday != null) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.asInstanceOf[js.Any])
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputDescription]
  }
}

