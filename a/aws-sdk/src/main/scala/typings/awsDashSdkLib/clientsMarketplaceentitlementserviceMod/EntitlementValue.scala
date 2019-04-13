package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementValue extends js.Object {
  /**
    * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise, the field will not be set.
    */
  var BooleanValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the field will not be set.
    */
  var DoubleValue: js.UndefOr[Double] = js.undefined
  /**
    * The IntegerValue field will be populated with an integer value when the entitlement is an integer type. Otherwise, the field will not be set.
    */
  var IntegerValue: js.UndefOr[Integer] = js.undefined
  /**
    * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the field will not be set.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object EntitlementValue {
  @scala.inline
  def apply(
    BooleanValue: js.UndefOr[Boolean] = js.undefined,
    DoubleValue: js.UndefOr[Double] = js.undefined,
    IntegerValue: js.UndefOr[Integer] = js.undefined,
    StringValue: String = null
  ): EntitlementValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue)
    if (!js.isUndefined(DoubleValue)) __obj.updateDynamic("DoubleValue")(DoubleValue)
    if (!js.isUndefined(IntegerValue)) __obj.updateDynamic("IntegerValue")(IntegerValue)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[EntitlementValue]
  }
}

