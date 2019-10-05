package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCasesRequest extends js.Object {
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.undefined
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.undefined
  /**
    * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
    */
  var caseIdList: js.UndefOr[CaseIdList] = js.undefined
  /**
    * The ID displayed for a case in the AWS Support Center user interface.
    */
  var displayId: js.UndefOr[DisplayId] = js.undefined
  /**
    * Specifies whether communications should be included in the DescribeCases results. The default is true.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined
  /**
    * Specifies whether resolved support cases should be included in the DescribeCases results. The default is false.
    */
  var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeCasesRequest {
  @scala.inline
  def apply(
    afterTime: AfterTime = null,
    beforeTime: BeforeTime = null,
    caseIdList: CaseIdList = null,
    displayId: DisplayId = null,
    includeCommunications: js.UndefOr[scala.Boolean] = js.undefined,
    includeResolvedCases: js.UndefOr[scala.Boolean] = js.undefined,
    language: Language = null,
    maxResults: Int | scala.Double = null,
    nextToken: NextToken = null
  ): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    if (afterTime != null) __obj.updateDynamic("afterTime")(afterTime)
    if (beforeTime != null) __obj.updateDynamic("beforeTime")(beforeTime)
    if (caseIdList != null) __obj.updateDynamic("caseIdList")(caseIdList)
    if (displayId != null) __obj.updateDynamic("displayId")(displayId)
    if (!js.isUndefined(includeCommunications)) __obj.updateDynamic("includeCommunications")(includeCommunications)
    if (!js.isUndefined(includeResolvedCases)) __obj.updateDynamic("includeResolvedCases")(includeResolvedCases)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeCasesRequest]
  }
}

