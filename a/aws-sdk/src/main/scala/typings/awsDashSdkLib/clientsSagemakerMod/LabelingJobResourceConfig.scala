package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobResourceConfig extends js.Object {
  /**
    * The AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
}

object LabelingJobResourceConfig {
  @scala.inline
  def apply(VolumeKmsKeyId: KmsKeyId = null): LabelingJobResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    __obj.asInstanceOf[LabelingJobResourceConfig]
  }
}

