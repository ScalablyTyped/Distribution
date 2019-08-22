package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeForecastResponse extends js.Object {
  /**
    * When the forecast creation task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the dataset group that provided the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The same forecast ARN as given in the request.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the forecast.
    */
  var ForecastName: js.UndefOr[Name] = js.undefined
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when inference (creating the forecast) starts (status changed to CREATE_IN_PROGRESS), and when inference is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The ARN of the predictor used to generate the forecast.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast must be ACTIVE before you can query or export the forecast. 
    */
  var Status: js.UndefOr[String] = js.undefined
}

object DescribeForecastResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatasetGroupArn: Arn = null,
    ForecastArn: Arn = null,
    ForecastName: Name = null,
    LastModificationTime: Timestamp = null,
    Message: ErrorMessage = null,
    PredictorArn: Arn = null,
    Status: String = null
  ): DescribeForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn)
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn)
    if (ForecastName != null) __obj.updateDynamic("ForecastName")(ForecastName)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DescribeForecastResponse]
  }
}

