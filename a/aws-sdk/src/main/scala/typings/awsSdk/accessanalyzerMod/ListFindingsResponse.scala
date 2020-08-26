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
  def apply(findings: FindingsList): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
  @scala.inline
  implicit class ListFindingsResponseOps[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindingsVarargs(value: FindingSummary*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: FindingsList): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: Token): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

