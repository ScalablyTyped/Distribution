package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingSetGenerationTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.undefined
}

object LabelingSetGenerationTaskRunProperties {
  @scala.inline
  def apply(OutputS3Path: UriString = null): LabelingSetGenerationTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (OutputS3Path != null) __obj.updateDynamic("OutputS3Path")(OutputS3Path)
    __obj.asInstanceOf[LabelingSetGenerationTaskRunProperties]
  }
}

