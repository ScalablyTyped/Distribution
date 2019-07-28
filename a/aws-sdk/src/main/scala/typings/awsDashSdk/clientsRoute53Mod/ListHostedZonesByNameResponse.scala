package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHostedZonesByNameResponse extends js.Object {
  /**
    * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.DNSName] = js.undefined
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsDashSdk.clientsRoute53Mod.HostedZones
  /**
    * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
    */
  var IsTruncated: PageTruncated
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextDNSName: js.UndefOr[DNSName] = js.undefined
  /**
    * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined
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
    val __obj = js.Dynamic.literal(HostedZones = HostedZones, IsTruncated = IsTruncated, MaxItems = MaxItems)
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    if (NextDNSName != null) __obj.updateDynamic("NextDNSName")(NextDNSName)
    if (NextHostedZoneId != null) __obj.updateDynamic("NextHostedZoneId")(NextHostedZoneId)
    __obj.asInstanceOf[ListHostedZonesByNameResponse]
  }
}

