package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportLabelsTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will export the labels.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.undefined
}

object ExportLabelsTaskRunProperties {
  @scala.inline
  def apply(OutputS3Path: UriString = null): ExportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (OutputS3Path != null) __obj.updateDynamic("OutputS3Path")(OutputS3Path)
    __obj.asInstanceOf[ExportLabelsTaskRunProperties]
  }
}

