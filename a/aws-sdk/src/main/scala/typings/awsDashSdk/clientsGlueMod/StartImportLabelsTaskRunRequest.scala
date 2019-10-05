package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartImportLabelsTaskRunRequest extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
    */
  var InputS3Path: UriString
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.undefined
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object StartImportLabelsTaskRunRequest {
  @scala.inline
  def apply(
    InputS3Path: UriString,
    TransformId: HashString,
    ReplaceAllLabels: js.UndefOr[scala.Boolean] = js.undefined
  ): StartImportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(InputS3Path = InputS3Path, TransformId = TransformId)
    if (!js.isUndefined(ReplaceAllLabels)) __obj.updateDynamic("ReplaceAllLabels")(ReplaceAllLabels)
    __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
  }
}

