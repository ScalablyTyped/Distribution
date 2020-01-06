package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceDetailsRequest extends js.Object {
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackName = js.native
  /**
    * A ConformancePackEvaluationFilters object.
    */
  var Filters: js.UndefOr[ConformancePackEvaluationFilters] = js.native
  /**
    * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[GetConformancePackComplianceDetailsLimit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceDetailsRequest {
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    Filters: ConformancePackEvaluationFilters = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): GetConformancePackComplianceDetailsRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceDetailsRequest]
  }
}

