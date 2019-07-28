package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainsResponse extends js.Object {
  /**
    * Information about the domains.
    */
  var Domains: js.UndefOr[DomainSummaryList] = js.undefined
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.NextToken] = js.undefined
}

object ListDomainsResponse {
  @scala.inline
  def apply(Domains: DomainSummaryList = null, NextToken: NextToken = null): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (Domains != null) __obj.updateDynamic("Domains")(Domains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDomainsResponse]
  }
}

