package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceRecordSetsRequest extends StObject {
  
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
    * The first name in the lexicographic ordering of resource record sets that you want to list. If the specified record name doesn't exist, the results begin with the first resource record set that has a name greater than the value of name.
    */
  var StartRecordName: js.UndefOr[DNSName] = js.undefined
  
  /**
    * The type of resource record set to begin the record listing from. Valid values for basic resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | NS | PTR | SOA | SPF | SRV | TXT  Values for weighted, latency, geolocation, and failover resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | PTR | SPF | SRV | TXT  Values for alias resource record sets:     API Gateway custom regional API or edge-optimized API: A    CloudFront distribution: A or AAAA    Elastic Beanstalk environment that has a regionalized subdomain: A    Elastic Load Balancing load balancer: A | AAAA    S3 bucket: A    VPC interface VPC endpoint: A    Another resource record set in this hosted zone: The type of the resource record set that the alias references.   Constraint: Specifying type without specifying name returns an InvalidInput error.
    */
  var StartRecordType: js.UndefOr[RRType] = js.undefined
}
object ListResourceRecordSetsRequest {
  
  inline def apply(HostedZoneId: ResourceId): ListResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceRecordSetsRequest] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setStartRecordIdentifier(value: ResourceRecordSetIdentifier): Self = StObject.set(x, "StartRecordIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStartRecordIdentifierUndefined: Self = StObject.set(x, "StartRecordIdentifier", js.undefined)
    
    inline def setStartRecordName(value: DNSName): Self = StObject.set(x, "StartRecordName", value.asInstanceOf[js.Any])
    
    inline def setStartRecordNameUndefined: Self = StObject.set(x, "StartRecordName", js.undefined)
    
    inline def setStartRecordType(value: RRType): Self = StObject.set(x, "StartRecordType", value.asInstanceOf[js.Any])
    
    inline def setStartRecordTypeUndefined: Self = StObject.set(x, "StartRecordType", js.undefined)
  }
}
