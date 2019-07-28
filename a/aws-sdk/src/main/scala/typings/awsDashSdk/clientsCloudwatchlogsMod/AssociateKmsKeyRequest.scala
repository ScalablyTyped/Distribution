package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateKmsKeyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
    */
  var kmsKeyId: KmsKeyId
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object AssociateKmsKeyRequest {
  @scala.inline
  def apply(kmsKeyId: KmsKeyId, logGroupName: LogGroupName): AssociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId, logGroupName = logGroupName)
  
    __obj.asInstanceOf[AssociateKmsKeyRequest]
  }
}

