package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobOutputConfig extends js.Object {
  /**
    * The AWS Key Management Service ID of the key used to encrypt the output data, if any.
    */
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The Amazon S3 location to write output data.
    */
  var S3OutputPath: S3Uri
}

object LabelingJobOutputConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri, KmsKeyId: KmsKeyId = null): LabelingJobOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[LabelingJobOutputConfig]
  }
}

