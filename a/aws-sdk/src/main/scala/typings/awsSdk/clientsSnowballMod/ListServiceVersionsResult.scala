package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceVersionsResult extends StObject {
  
  /**
    * A list of names and versions of dependant services of the service for which the system provided supported versions.
    */
  var DependentServices: js.UndefOr[DependentServiceList] = js.undefined
  
  /**
    * Because HTTP requests are stateless, this is the starting point of the next list of returned ListServiceVersionsResult results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service for which the system provided supported versions.
    */
  var ServiceName: typings.awsSdk.clientsSnowballMod.ServiceName
  
  /**
    * A list of supported versions.
    */
  var ServiceVersions: ServiceVersionList
}
object ListServiceVersionsResult {
  
  inline def apply(ServiceName: ServiceName, ServiceVersions: ServiceVersionList): ListServiceVersionsResult = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceVersions = ServiceVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceVersionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceVersionsResult] (val x: Self) extends AnyVal {
    
    inline def setDependentServices(value: DependentServiceList): Self = StObject.set(x, "DependentServices", value.asInstanceOf[js.Any])
    
    inline def setDependentServicesUndefined: Self = StObject.set(x, "DependentServices", js.undefined)
    
    inline def setDependentServicesVarargs(value: DependentService*): Self = StObject.set(x, "DependentServices", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceVersions(value: ServiceVersionList): Self = StObject.set(x, "ServiceVersions", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionsVarargs(value: ServiceVersion*): Self = StObject.set(x, "ServiceVersions", js.Array(value*))
  }
}
