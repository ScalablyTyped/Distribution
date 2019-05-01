package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBudgetsForResourceOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[Budgets] = js.undefined
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}

object ListBudgetsForResourceOutput {
  @scala.inline
  def apply(Budgets: Budgets = null, NextPageToken: PageToken = null): ListBudgetsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[ListBudgetsForResourceOutput]
  }
}

