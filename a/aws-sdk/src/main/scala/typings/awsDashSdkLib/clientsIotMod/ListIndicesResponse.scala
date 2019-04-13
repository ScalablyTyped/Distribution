package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndicesResponse extends js.Object {
  /**
    * The index names.
    */
  var indexNames: js.UndefOr[IndexNamesList] = js.undefined
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListIndicesResponse {
  @scala.inline
  def apply(indexNames: IndexNamesList = null, nextToken: NextToken = null): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexNames != null) __obj.updateDynamic("indexNames")(indexNames)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListIndicesResponse]
  }
}

