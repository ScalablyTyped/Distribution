package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArchiveRulesRequest extends js.Object {
  /**
    * The name of the analyzer to retrieve rules from.
    */
  var analyzerName: Name = js.native
  /**
    * The maximum number of results to return in the request.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListArchiveRulesRequest {
  @scala.inline
  def apply(analyzerName: Name, maxResults: js.UndefOr[Integer] = js.undefined, nextToken: Token = null): ListArchiveRulesRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesRequest]
  }
}

