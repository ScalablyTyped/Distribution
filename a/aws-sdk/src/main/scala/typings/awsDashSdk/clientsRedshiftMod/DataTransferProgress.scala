package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTransferProgress extends js.Object {
  /**
    * Describes the data transfer rate in MB's per second.
    */
  var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * Describes the total amount of data that has been transfered in MB's.
    */
  var DataTransferredInMegaBytes: js.UndefOr[Long] = js.undefined
  /**
    * Describes the number of seconds that have elapsed during the data transfer.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
  /**
    * Describes the estimated number of seconds remaining to complete the transfer.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
  /**
    * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * Describes the total amount of data to be transfered in megabytes.
    */
  var TotalDataInMegaBytes: js.UndefOr[Long] = js.undefined
}

object DataTransferProgress {
  @scala.inline
  def apply(
    CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
    DataTransferredInMegaBytes: js.UndefOr[Long] = js.undefined,
    ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
    EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
    Status: String = null,
    TotalDataInMegaBytes: js.UndefOr[Long] = js.undefined
  ): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentRateInMegaBytesPerSecond)) __obj.updateDynamic("CurrentRateInMegaBytesPerSecond")(CurrentRateInMegaBytesPerSecond)
    if (!js.isUndefined(DataTransferredInMegaBytes)) __obj.updateDynamic("DataTransferredInMegaBytes")(DataTransferredInMegaBytes)
    if (!js.isUndefined(ElapsedTimeInSeconds)) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds)
    if (!js.isUndefined(EstimatedTimeToCompletionInSeconds)) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(TotalDataInMegaBytes)) __obj.updateDynamic("TotalDataInMegaBytes")(TotalDataInMegaBytes)
    __obj.asInstanceOf[DataTransferProgress]
  }
}

