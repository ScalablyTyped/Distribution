package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValuesWithAttributes extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Attributes] = js.undefined
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Value] = js.undefined
}

object DimensionValuesWithAttributes {
  @scala.inline
  def apply(Attributes: Attributes = null, Value: Value = null): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
}

