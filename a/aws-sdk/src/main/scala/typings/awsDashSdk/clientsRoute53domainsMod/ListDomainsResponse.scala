package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResponse extends js.Object {
  /**
    * A summary of domains.
    */
  var Domains: DomainSummaryList = js.native
  /**
    * If there are more domains than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
}

object ListDomainsResponse {
  @scala.inline
  def apply(Domains: DomainSummaryList, NextPageMarker: PageMarker = null): ListDomainsResponse = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any])
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
}

