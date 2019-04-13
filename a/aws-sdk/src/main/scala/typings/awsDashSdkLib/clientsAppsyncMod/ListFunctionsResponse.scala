package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFunctionsResponse extends js.Object {
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[Functions] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListFunctionsResponse {
  @scala.inline
  def apply(functions: Functions = null, nextToken: PaginationToken = null): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListFunctionsResponse]
  }
}

