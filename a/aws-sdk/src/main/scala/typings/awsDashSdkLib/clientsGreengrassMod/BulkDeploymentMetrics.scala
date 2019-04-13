package typings
package awsDashSdkLib.clientsGreengrassMod

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
    InvalidInputRecords: js.UndefOr[__integer] = js.undefined,
    RecordsProcessed: js.UndefOr[__integer] = js.undefined,
    RetryAttempts: js.UndefOr[__integer] = js.undefined
  ): BulkDeploymentMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InvalidInputRecords)) __obj.updateDynamic("InvalidInputRecords")(InvalidInputRecords)
    if (!js.isUndefined(RecordsProcessed)) __obj.updateDynamic("RecordsProcessed")(RecordsProcessed)
    if (!js.isUndefined(RetryAttempts)) __obj.updateDynamic("RetryAttempts")(RetryAttempts)
    __obj.asInstanceOf[BulkDeploymentMetrics]
  }
}

