package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictorSummary extends js.Object {
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when training starts (status changed to CREATE_IN_PROGRESS), and when training is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.undefined
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED     The Status of the predictor must be ACTIVE before using the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
}

object PredictorSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatasetGroupArn: Arn = null,
    LastModificationTime: Timestamp = null,
    Message: ErrorMessage = null,
    PredictorArn: Arn = null,
    PredictorName: Name = null,
    Status: Status = null
  ): PredictorSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn)
    if (PredictorName != null) __obj.updateDynamic("PredictorName")(PredictorName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[PredictorSummary]
  }
}

