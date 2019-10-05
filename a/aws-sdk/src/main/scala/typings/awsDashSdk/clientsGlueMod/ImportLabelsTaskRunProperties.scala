package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportLabelsTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
    */
  var InputS3Path: js.UndefOr[UriString] = js.undefined
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var Replace: js.UndefOr[ReplaceBoolean] = js.undefined
}

object ImportLabelsTaskRunProperties {
  @scala.inline
  def apply(InputS3Path: UriString = null, Replace: js.UndefOr[scala.Boolean] = js.undefined): ImportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (InputS3Path != null) __obj.updateDynamic("InputS3Path")(InputS3Path)
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace)
    __obj.asInstanceOf[ImportLabelsTaskRunProperties]
  }
}

