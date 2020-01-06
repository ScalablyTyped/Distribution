package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldPatterns extends js.Object {
  /**
    * An array of the field-level encryption field patterns.
    */
  var Items: js.UndefOr[FieldPatternList] = js.native
  /**
    * The number of field-level encryption field patterns.
    */
  var Quantity: integer = js.native
}

object FieldPatterns {
  @scala.inline
  def apply(Quantity: integer, Items: FieldPatternList = null): FieldPatterns = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPatterns]
  }
}

