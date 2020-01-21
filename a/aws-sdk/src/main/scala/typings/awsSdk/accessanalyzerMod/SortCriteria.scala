package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriteria extends js.Object {
  /**
    * The name of the attribute to sort on.
    */
  var attributeName: js.UndefOr[String] = js.native
  /**
    * The sort order, ascending or descending.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}

object SortCriteria {
  @scala.inline
  def apply(attributeName: String = null, orderBy: OrderBy = null): SortCriteria = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
}

