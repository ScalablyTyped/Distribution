package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsResponse extends js.Object {
  /**
    * A list of findings retrieved from the analyzer that match the filter criteria specified, if any.
    */
  var findings: FindingsList = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListFindingsResponse {
  @scala.inline
  def apply(findings: FindingsList, nextToken: Token = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

