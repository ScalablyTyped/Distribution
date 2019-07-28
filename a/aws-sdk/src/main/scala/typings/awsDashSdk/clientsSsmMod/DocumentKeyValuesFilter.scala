package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentKeyValuesFilter extends js.Object {
  /**
    * The name of the filter key.
    */
  var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.undefined
  /**
    * The value for the filter key.
    */
  var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.undefined
}

object DocumentKeyValuesFilter {
  @scala.inline
  def apply(Key: DocumentKeyValuesFilterKey = null, Values: DocumentKeyValuesFilterValues = null): DocumentKeyValuesFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[DocumentKeyValuesFilter]
  }
}

