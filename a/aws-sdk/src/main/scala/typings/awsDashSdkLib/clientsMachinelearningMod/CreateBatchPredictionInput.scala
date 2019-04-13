package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBatchPredictionInput extends js.Object {
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: EntityId
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId
  /**
    * A user-supplied name or description of the BatchPrediction. BatchPredictionName can only use the UTF-8 character set.
    */
  var BatchPredictionName: js.UndefOr[EntityName] = js.undefined
  /**
    * The ID of the MLModel that will generate predictions for the group of observations. 
    */
  var MLModelId: EntityId
  /**
    * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'. Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set permissions, see the Amazon Machine Learning Developer Guide.
    */
  var OutputUri: S3Url
}

object CreateBatchPredictionInput {
  @scala.inline
  def apply(
    BatchPredictionDataSourceId: EntityId,
    BatchPredictionId: EntityId,
    MLModelId: EntityId,
    OutputUri: S3Url,
    BatchPredictionName: EntityName = null
  ): CreateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionDataSourceId = BatchPredictionDataSourceId, BatchPredictionId = BatchPredictionId, MLModelId = MLModelId, OutputUri = OutputUri)
    if (BatchPredictionName != null) __obj.updateDynamic("BatchPredictionName")(BatchPredictionName)
    __obj.asInstanceOf[CreateBatchPredictionInput]
  }
}

