package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResponse extends js.Object {
  /**
    * The list of domains.
    */
  var Domains: js.UndefOr[DomainList] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListDomainsResponse {
  @scala.inline
  def apply(Domains: DomainList = null, NextToken: NextToken = null): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
}

