package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSecurityConfigurationResponse extends js.Object {
  /**
    * The time at which the new security configuration was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The name assigned to the new security configuration.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object CreateSecurityConfigurationResponse {
  @scala.inline
  def apply(CreatedTimestamp: TimestampValue = null, Name: NameString = null): CreateSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateSecurityConfigurationResponse]
  }
}

