package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedZonesByNameResponse extends js.Object {
  /**
    * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.DNSName] = js.native
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsDashSdk.clientsRoute53Mod.HostedZones = js.native
  /**
    * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextDNSName: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextHostedZoneId: js.UndefOr[ResourceId] = js.native
}

object ListHostedZonesByNameResponse {
  @scala.inline
  def apply(
    HostedZones: HostedZones,
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    DNSName: DNSName = null,
    HostedZoneId: ResourceId = null,
    NextDNSName: DNSName = null,
    NextHostedZoneId: ResourceId = null
  ): ListHostedZonesByNameResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (NextDNSName != null) __obj.updateDynamic("NextDNSName")(NextDNSName.asInstanceOf[js.Any])
    if (NextHostedZoneId != null) __obj.updateDynamic("NextHostedZoneId")(NextHostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByNameResponse]
  }
}

