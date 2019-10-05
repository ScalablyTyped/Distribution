package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkDeploymentMetrics extends js.Object {
  /**
    * The total number of records that returned a non-retryable error. For example, this can occur if a group record from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role doesn't grant permission to deploy a group or group version.
    */
  var InvalidInputRecords: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of group records from the input file that have been processed so far, or attempted.
    */
  var RecordsProcessed: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to five times.
    */
  var RetryAttempts: js.UndefOr[__integer] = js.undefined
}

object BulkDeploymentMetrics {
  @scala.inline
  def apply(
    InvalidInputRecords: Int | Double = null,
    RecordsProcessed: Int | Double = null,
    RetryAttempts: Int | Double = null
  ): BulkDeploymentMetrics = {
    val __obj = js.Dynamic.literal()
    if (InvalidInputRecords != null) __obj.updateDynamic("InvalidInputRecords")(InvalidInputRecords.asInstanceOf[js.Any])
    if (RecordsProcessed != null) __obj.updateDynamic("RecordsProcessed")(RecordsProcessed.asInstanceOf[js.Any])
    if (RetryAttempts != null) __obj.updateDynamic("RetryAttempts")(RetryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDeploymentMetrics]
  }
}

