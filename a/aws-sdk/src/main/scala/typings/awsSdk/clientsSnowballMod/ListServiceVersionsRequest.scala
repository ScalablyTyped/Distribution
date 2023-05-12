package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceVersionsRequest extends StObject {
  
  /**
    * A list of names and versions of dependant services of the requested service.
    */
  var DependentServices: js.UndefOr[DependentServiceList] = js.undefined
  
  /**
    * The maximum number of ListServiceVersions objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * Because HTTP requests are stateless, this is the starting point for the next list of returned ListServiceVersionsRequest versions.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service for which you're requesting supported versions.
    */
  var ServiceName: typings.awsSdk.clientsSnowballMod.ServiceName
}
object ListServiceVersionsRequest {
  
  inline def apply(ServiceName: ServiceName): ListServiceVersionsRequest = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDependentServices(value: DependentServiceList): Self = StObject.set(x, "DependentServices", value.asInstanceOf[js.Any])
    
    inline def setDependentServicesUndefined: Self = StObject.set(x, "DependentServices", js.undefined)
    
    inline def setDependentServicesVarargs(value: DependentService*): Self = StObject.set(x, "DependentServices", js.Array(value*))
    
    inline def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
