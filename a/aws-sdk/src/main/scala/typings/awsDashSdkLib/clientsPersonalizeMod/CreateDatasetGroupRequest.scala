package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  /**
    * The name for the new dataset group.
    */
  var name: Name
  /**
    * The ARN of the IAM role that has permissions to access the KMS key. Supplying an IAM role is only valid when also specifying a KMS key.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(name: Name, kmsKeyArn: KmsKeyArn = null, roleArn: RoleArn = null): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
}

