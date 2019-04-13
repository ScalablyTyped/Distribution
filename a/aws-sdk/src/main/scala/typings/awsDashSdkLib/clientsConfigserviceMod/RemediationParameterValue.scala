package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationParameterValue extends js.Object {
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[ResourceValue] = js.undefined
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[StaticValue] = js.undefined
}

object RemediationParameterValue {
  @scala.inline
  def apply(ResourceValue: ResourceValue = null, StaticValue: StaticValue = null): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    if (ResourceValue != null) __obj.updateDynamic("ResourceValue")(ResourceValue)
    if (StaticValue != null) __obj.updateDynamic("StaticValue")(StaticValue)
    __obj.asInstanceOf[RemediationParameterValue]
  }
}

