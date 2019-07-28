package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetResponse extends js.Object {
  /**
    * The ARN of the data set.
    */
  var datasetArn: js.UndefOr[DatasetArn] = js.undefined
  /**
    * The name of the data set.
    */
  var datasetName: js.UndefOr[DatasetName] = js.undefined
  /**
    * How long, in days, data set contents are kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}

object CreateDatasetResponse {
  @scala.inline
  def apply(
    datasetArn: DatasetArn = null,
    datasetName: DatasetName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    if (datasetName != null) __obj.updateDynamic("datasetName")(datasetName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}

