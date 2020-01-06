package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriterion extends js.Object {
  /**
    * The name of the field on which to sort.
    */
  var FieldName: js.UndefOr[ValueString] = js.native
  /**
    * An ascending or descending sort.
    */
  var Sort: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Sort] = js.native
}

object SortCriterion {
  @scala.inline
  def apply(FieldName: ValueString = null, Sort: Sort = null): SortCriterion = {
    val __obj = js.Dynamic.literal()
    if (FieldName != null) __obj.updateDynamic("FieldName")(FieldName.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion]
  }
}

