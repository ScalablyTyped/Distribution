package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfiguration extends js.Object {
  /**
    * The time at which this security configuration was created.
    */
  var CreatedTimeStamp: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The encryption configuration associated with this security configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsGlueMod.EncryptionConfiguration] = js.undefined
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object SecurityConfiguration {
  @scala.inline
  def apply(
    CreatedTimeStamp: TimestampValue = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    Name: NameString = null
  ): SecurityConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp)
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SecurityConfiguration]
  }
}

