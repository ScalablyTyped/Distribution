package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMLLabelingSetGenerationTaskRunRequest extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you generate the labeling set.
    */
  var OutputS3Path: UriString
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object StartMLLabelingSetGenerationTaskRunRequest {
  @scala.inline
  def apply(OutputS3Path: UriString, TransformId: HashString): StartMLLabelingSetGenerationTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path, TransformId = TransformId)
  
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunRequest]
  }
}

