package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetRevisionsResponse extends js.Object {
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.NextToken] = js.native
  /**
    * The asset objects listed by the request.
    */
  var Revisions: js.UndefOr[ListOfRevisionEntry] = js.native
}

object ListDataSetRevisionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Revisions: ListOfRevisionEntry = null): ListDataSetRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetRevisionsResponse]
  }
}

