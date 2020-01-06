package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringOutputConfig extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.KmsKeyId] = js.native
  /**
    * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
    */
  var MonitoringOutputs: typings.awsDashSdk.clientsSagemakerMod.MonitoringOutputs = js.native
}

object MonitoringOutputConfig {
  @scala.inline
  def apply(MonitoringOutputs: MonitoringOutputs, KmsKeyId: KmsKeyId = null): MonitoringOutputConfig = {
    val __obj = js.Dynamic.literal(MonitoringOutputs = MonitoringOutputs.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutputConfig]
  }
}

