package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSolutionsResponse extends js.Object {
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.undefined
}

object ListSolutionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, solutions: Solutions = null): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (solutions != null) __obj.updateDynamic("solutions")(solutions)
    __obj.asInstanceOf[ListSolutionsResponse]
  }
}

