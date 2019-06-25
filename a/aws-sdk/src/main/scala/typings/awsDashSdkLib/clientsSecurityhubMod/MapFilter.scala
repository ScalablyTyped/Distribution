package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapFilter extends js.Object {
  /**
    * The condition to apply to a key value when querying for findings with a map filter.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.undefined
  /**
    * The key of the map filter.
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The value for the key in the map filter.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}

object MapFilter {
  @scala.inline
  def apply(Comparison: MapFilterComparison = null, Key: NonEmptyString = null, Value: NonEmptyString = null): MapFilter = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MapFilter]
  }
}

