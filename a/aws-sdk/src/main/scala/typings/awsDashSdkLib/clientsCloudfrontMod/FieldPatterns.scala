package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldPatterns extends js.Object {
  /**
    * An array of the field-level encryption field patterns.
    */
  var Items: js.UndefOr[FieldPatternList] = js.undefined
  /**
    * The number of field-level encryption field patterns.
    */
  var Quantity: integer
}

object FieldPatterns {
  @scala.inline
  def apply(Quantity: integer, Items: FieldPatternList = null): FieldPatterns = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[FieldPatterns]
  }
}

