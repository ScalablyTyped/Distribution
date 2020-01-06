package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPredicate extends js.Object {
  /**
    * The comparator used to compare this property to others.
    */
  var Comparator: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Comparator] = js.native
  /**
    * The key of the property.
    */
  var Key: js.UndefOr[ValueString] = js.native
  /**
    * The value of the property.
    */
  var Value: js.UndefOr[ValueString] = js.native
}

object PropertyPredicate {
  @scala.inline
  def apply(Comparator: Comparator = null, Key: ValueString = null, Value: ValueString = null): PropertyPredicate = {
    val __obj = js.Dynamic.literal()
    if (Comparator != null) __obj.updateDynamic("Comparator")(Comparator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPredicate]
  }
}

