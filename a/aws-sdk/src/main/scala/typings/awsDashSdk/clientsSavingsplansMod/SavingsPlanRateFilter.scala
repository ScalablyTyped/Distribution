package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRateFilter extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterName] = js.native
  /**
    * The filter values.
    */
  var values: js.UndefOr[ListOfStrings] = js.native
}

object SavingsPlanRateFilter {
  @scala.inline
  def apply(name: SavingsPlanRateFilterName = null, values: ListOfStrings = null): SavingsPlanRateFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanRateFilter]
  }
}

