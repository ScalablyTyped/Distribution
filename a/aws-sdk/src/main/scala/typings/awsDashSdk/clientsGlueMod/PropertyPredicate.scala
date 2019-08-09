package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPredicate extends js.Object {
  /**
    * The comparator used to compare this property to others.
    */
  var Comparator: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Comparator] = js.undefined
  /**
    * The key of the property.
    */
  var Key: js.UndefOr[ValueString] = js.undefined
  /**
    * The value of the property.
    */
  var Value: js.UndefOr[ValueString] = js.undefined
}

object PropertyPredicate {
  @scala.inline
  def apply(Comparator: Comparator = null, Key: ValueString = null, Value: ValueString = null): PropertyPredicate = {
    val __obj = js.Dynamic.literal()
    if (Comparator != null) __obj.updateDynamic("Comparator")(Comparator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[PropertyPredicate]
  }
}

