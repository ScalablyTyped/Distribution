package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingOutputConfig extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the processing job output. KmsKeyId can be an ID of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS key. The KmsKeyId is applied to all outputs.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.KmsKeyId] = js.native
  /**
    * Output configuration information for a processing job.
    */
  var Outputs: ProcessingOutputs = js.native
}

object ProcessingOutputConfig {
  @scala.inline
  def apply(Outputs: ProcessingOutputs, KmsKeyId: KmsKeyId = null): ProcessingOutputConfig = {
    val __obj = js.Dynamic.literal(Outputs = Outputs.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutputConfig]
  }
}

