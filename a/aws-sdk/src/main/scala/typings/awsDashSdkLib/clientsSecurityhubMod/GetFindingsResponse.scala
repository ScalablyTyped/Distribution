package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsResponse extends js.Object {
  /**
    * The findings that matched the filters specified in the request.
    */
  var Findings: AwsSecurityFindingList
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList, NextToken: NextToken = null): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

