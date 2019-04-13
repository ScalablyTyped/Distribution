package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainsResponse extends js.Object {
  /**
    * A summary of domains.
    */
  var Domains: DomainSummaryList
  /**
    * If there are more domains than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
}

object ListDomainsResponse {
  @scala.inline
  def apply(Domains: DomainSummaryList, NextPageMarker: PageMarker = null): ListDomainsResponse = {
    val __obj = js.Dynamic.literal(Domains = Domains)
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker)
    __obj.asInstanceOf[ListDomainsResponse]
  }
}

