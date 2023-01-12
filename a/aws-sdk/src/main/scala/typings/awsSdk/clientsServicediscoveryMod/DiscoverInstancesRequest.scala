package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInstancesRequest extends StObject {
  
  /**
    * The health status of the instances that you want to discover. This parameter is ignored for services that don't have a health check configured, and all instances are returned.  HEALTHY  Returns healthy instances.  UNHEALTHY  Returns unhealthy instances.  ALL  Returns all instances.  HEALTHY_OR_ELSE_ALL  Returns healthy instances, unless none are reporting a healthy state. In that case, return all instances. This is also called failing open.  
    */
  var HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined
  
  /**
    * The maximum number of instances that you want Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[DiscoverMaxResults] = js.undefined
  
  /**
    * The HttpName name of the namespace. It's found in the HttpProperties member of the Properties member of the namespace.
    */
  var NamespaceName: typings.awsSdk.clientsServicediscoveryMod.NamespaceName
  
  /**
    * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the filters specified in both the QueryParameters parameter and this parameter, all of these instances are returned. Otherwise, the filters are ignored, and only instances that match the filters that are specified in the QueryParameters parameter are returned.
    */
  var OptionalParameters: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Filters to scope the results based on custom attributes for the instance (for example, {version=v1, az=1a}). Only instances that match all the specified key-value pairs are returned.
    */
  var QueryParameters: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: typings.awsSdk.clientsServicediscoveryMod.ServiceName
}
object DiscoverInstancesRequest {
  
  inline def apply(NamespaceName: NamespaceName, ServiceName: ServiceName): DiscoverInstancesRequest = {
    val __obj = js.Dynamic.literal(NamespaceName = NamespaceName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoverInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: HealthStatusFilter): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setMaxResults(value: DiscoverMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
    
    inline def setOptionalParameters(value: Attributes): Self = StObject.set(x, "OptionalParameters", value.asInstanceOf[js.Any])
    
    inline def setOptionalParametersUndefined: Self = StObject.set(x, "OptionalParameters", js.undefined)
    
    inline def setQueryParameters(value: Attributes): Self = StObject.set(x, "QueryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "QueryParameters", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
