package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSuitesResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the suites.
    */
  var suites: js.UndefOr[Suites] = js.undefined
}

object ListSuitesResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, suites: Suites = null): ListSuitesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (suites != null) __obj.updateDynamic("suites")(suites)
    __obj.asInstanceOf[ListSuitesResult]
  }
}

