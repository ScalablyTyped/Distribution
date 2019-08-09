package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartExportLabelsTaskRunRequest extends js.Object {
  /**
    * The Amazon S3 path where you export the labels.
    */
  var OutputS3Path: UriString
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object StartExportLabelsTaskRunRequest {
  @scala.inline
  def apply(OutputS3Path: UriString, TransformId: HashString): StartExportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path, TransformId = TransformId)
  
    __obj.asInstanceOf[StartExportLabelsTaskRunRequest]
  }
}

