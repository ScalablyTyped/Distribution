package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHostedZonesByNameRequest extends js.Object {
  /**
    * (Optional) For your first request to ListHostedZonesByName, include the dnsname parameter only if you want to specify the name of the first hosted zone in the response. If you don't include the dnsname parameter, Amazon Route 53 returns all of the hosted zones that were created by the current AWS account, in ASCII order. For subsequent requests, include both dnsname and hostedzoneid parameters. For dnsname, specify the value of NextDNSName from the previous response.
    */
  var DNSName: js.UndefOr[DNSName] = js.undefined
  /**
    * (Optional) For your first request to ListHostedZonesByName, do not include the hostedzoneid parameter. If you have more hosted zones than the value of maxitems, ListHostedZonesByName returns only the first maxitems hosted zones. To get the next group of maxitems hosted zones, submit another request to ListHostedZonesByName and include both dnsname and hostedzoneid parameters. For the value of hostedzoneid, specify the value of the NextHostedZoneId element from the previous response.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The maximum number of hosted zones to be included in the response body for this request. If you have more than maxitems hosted zones, then the value of the IsTruncated element in the response is true, and the values of NextDNSName and NextHostedZoneId specify the first hosted zone in the next group of maxitems hosted zones. 
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
}

object ListHostedZonesByNameRequest {
  @scala.inline
  def apply(DNSName: DNSName = null, HostedZoneId: ResourceId = null, MaxItems: PageMaxItems = null): ListHostedZonesByNameRequest = {
    val __obj = js.Dynamic.literal()
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListHostedZonesByNameRequest]
  }
}

