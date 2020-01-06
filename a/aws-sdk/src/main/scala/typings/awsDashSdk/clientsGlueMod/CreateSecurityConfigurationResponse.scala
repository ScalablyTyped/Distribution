package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityConfigurationResponse extends js.Object {
  /**
    * The time at which the new security configuration was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampValue] = js.native
  /**
    * The name assigned to the new security configuration.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object CreateSecurityConfigurationResponse {
  @scala.inline
  def apply(CreatedTimestamp: TimestampValue = null, Name: NameString = null): CreateSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationResponse]
  }
}

