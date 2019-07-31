package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceRecordSetsRequest extends js.Object {
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to list.
    */
  var HostedZoneId: ResourceId
  /**
    * (Optional) The maximum number of resource records sets to include in the response body for this request. If the response includes more than maxitems resource record sets, the value of the IsTruncated element in the response is true, and the values of the NextRecordName and NextRecordType elements in the response identify the first resource record set in the next group of maxitems resource record sets.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  /**
    *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, specify the value of NextRecordIdentifier from the previous response to get the next resource record set that has the current DNS name and type.
    */
  var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined
  /**
    * The first name in the lexicographic ordering of resource record sets that you want to list.
    */
  var StartRecordName: js.UndefOr[DNSName] = js.undefined
  /**
    * The type of resource record set to begin the record listing from. Valid values for basic resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | NS | PTR | SOA | SPF | SRV | TXT  Values for weighted, latency, geolocation, and failover resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | PTR | SPF | SRV | TXT  Values for alias resource record sets:     API Gateway custom regional API or edge-optimized API: A    CloudFront distribution: A or AAAA    Elastic Beanstalk environment that has a regionalized subdomain: A    Elastic Load Balancing load balancer: A | AAAA    Amazon S3 bucket: A    Amazon VPC interface VPC endpoint: A    Another resource record set in this hosted zone: The type of the resource record set that the alias references.   Constraint: Specifying type without specifying name returns an InvalidInput error.
    */
  var StartRecordType: js.UndefOr[RRType] = js.undefined
}

object ListResourceRecordSetsRequest {
  @scala.inline
  def apply(
    HostedZoneId: ResourceId,
    MaxItems: PageMaxItems = null,
    StartRecordIdentifier: ResourceRecordSetIdentifier = null,
    StartRecordName: DNSName = null,
    StartRecordType: RRType = null
  ): ListResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    if (StartRecordIdentifier != null) __obj.updateDynamic("StartRecordIdentifier")(StartRecordIdentifier)
    if (StartRecordName != null) __obj.updateDynamic("StartRecordName")(StartRecordName)
    if (StartRecordType != null) __obj.updateDynamic("StartRecordType")(StartRecordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsRequest]
  }
}

