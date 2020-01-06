package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationParameterValue extends js.Object {
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceValue] = js.native
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.StaticValue] = js.native
}

object RemediationParameterValue {
  @scala.inline
  def apply(ResourceValue: ResourceValue = null, StaticValue: StaticValue = null): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    if (ResourceValue != null) __obj.updateDynamic("ResourceValue")(ResourceValue.asInstanceOf[js.Any])
    if (StaticValue != null) __obj.updateDynamic("StaticValue")(StaticValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationParameterValue]
  }
}

