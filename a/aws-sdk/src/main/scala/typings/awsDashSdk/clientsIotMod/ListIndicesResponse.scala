package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * The index names.
    */
  var indexNames: js.UndefOr[IndexNamesList] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(indexNames: IndexNamesList = null, nextToken: NextToken = null): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexNames != null) __obj.updateDynamic("indexNames")(indexNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
}

