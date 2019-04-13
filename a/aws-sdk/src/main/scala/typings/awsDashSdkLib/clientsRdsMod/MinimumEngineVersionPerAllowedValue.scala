package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimumEngineVersionPerAllowedValue extends js.Object {
  /**
    * The allowed value for an option setting.
    */
  var AllowedValue: js.UndefOr[String] = js.undefined
  /**
    * The minimum DB engine version required for the allowed value.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
}

object MinimumEngineVersionPerAllowedValue {
  @scala.inline
  def apply(AllowedValue: String = null, MinimumEngineVersion: String = null): MinimumEngineVersionPerAllowedValue = {
    val __obj = js.Dynamic.literal()
    if (AllowedValue != null) __obj.updateDynamic("AllowedValue")(AllowedValue)
    if (MinimumEngineVersion != null) __obj.updateDynamic("MinimumEngineVersion")(MinimumEngineVersion)
    __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
  }
}

