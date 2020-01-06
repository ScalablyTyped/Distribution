package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationProperties extends js.Object {
  /**
    * The ARN of the resource to publish to.
    */
  var DestinationArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the KMS key to use for encryption.
    */
  var KmsKeyArn: js.UndefOr[String] = js.native
}

object DestinationProperties {
  @scala.inline
  def apply(DestinationArn: String = null, KmsKeyArn: String = null): DestinationProperties = {
    val __obj = js.Dynamic.literal()
    if (DestinationArn != null) __obj.updateDynamic("DestinationArn")(DestinationArn.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationProperties]
  }
}

