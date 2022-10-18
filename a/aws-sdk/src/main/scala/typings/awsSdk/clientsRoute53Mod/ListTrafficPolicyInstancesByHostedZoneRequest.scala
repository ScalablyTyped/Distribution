package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficPolicyInstancesByHostedZoneRequest extends StObject {
  
  /**
    * The ID of the hosted zone that you want to list traffic policy instances for.
    */
  var HostedZoneId: ResourceId
  
  /**
    * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
  
  /**
    * If the value of IsTruncated in the previous response is true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
}
object ListTrafficPolicyInstancesByHostedZoneRequest {
  
  inline def apply(HostedZoneId: ResourceId): ListTrafficPolicyInstancesByHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
  }
  
  extension [Self <: ListTrafficPolicyInstancesByHostedZoneRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setTrafficPolicyInstanceNameMarker(value: DNSName): Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstanceNameMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceNameMarker", js.undefined)
    
    inline def setTrafficPolicyInstanceTypeMarker(value: RRType): Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyInstanceTypeMarkerUndefined: Self = StObject.set(x, "TrafficPolicyInstanceTypeMarker", js.undefined)
  }
}
