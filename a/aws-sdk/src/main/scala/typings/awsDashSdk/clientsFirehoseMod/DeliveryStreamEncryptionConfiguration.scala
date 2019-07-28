package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryStreamEncryptionConfiguration extends js.Object {
  /**
    * For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption.
    */
  var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.undefined
}

object DeliveryStreamEncryptionConfiguration {
  @scala.inline
  def apply(Status: DeliveryStreamEncryptionStatus = null): DeliveryStreamEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamEncryptionConfiguration]
  }
}

