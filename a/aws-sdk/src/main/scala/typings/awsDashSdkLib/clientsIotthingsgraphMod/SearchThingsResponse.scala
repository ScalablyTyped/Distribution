package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchThingsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of things in the result set.
    */
  var things: js.UndefOr[Things] = js.undefined
}

object SearchThingsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, things: Things = null): SearchThingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (things != null) __obj.updateDynamic("things")(things)
    __obj.asInstanceOf[SearchThingsResponse]
  }
}

