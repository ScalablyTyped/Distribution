package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessDetail extends StObject {
  
  /**
    * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated principal last attempted to access the service. Amazon Web Services does not report unauthenticated requests. This field is null if no principals (IAM users, IAM roles, or root user) in the reported Organizations entity attempted to access the service within the tracking period.
    */
  var EntityPath: js.UndefOr[organizationsEntityPathType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated principal most recently attempted to access the service. Amazon Web Services does not report unauthenticated requests. This field is null if no principals in the reported Organizations entity attempted to access the service within the tracking period.
    */
  var LastAuthenticatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Region where the last service access attempt occurred. This field is null if no principals in the reported Organizations entity attempted to access the service within the tracking period.
    */
  var Region: js.UndefOr[stringType] = js.undefined
  
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType
  
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, see Actions, resources, and condition keys for Amazon Web Services services in the Service Authorization Reference. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see Amazon Web Services service namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: serviceNamespaceType
  
  /**
    * The number of accounts with authenticated principals (root user, IAM users, and IAM roles) that attempted to access the service in the tracking period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
}
object AccessDetail {
  
  inline def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): AccessDetail = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessDetail] (val x: Self) extends AnyVal {
    
    inline def setEntityPath(value: organizationsEntityPathType): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    inline def setEntityPathUndefined: Self = StObject.set(x, "EntityPath", js.undefined)
    
    inline def setLastAuthenticatedTime(value: js.Date): Self = StObject.set(x, "LastAuthenticatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedTimeUndefined: Self = StObject.set(x, "LastAuthenticatedTime", js.undefined)
    
    inline def setRegion(value: stringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setServiceName(value: serviceNameType): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setTotalAuthenticatedEntities(value: integerType): Self = StObject.set(x, "TotalAuthenticatedEntities", value.asInstanceOf[js.Any])
    
    inline def setTotalAuthenticatedEntitiesUndefined: Self = StObject.set(x, "TotalAuthenticatedEntities", js.undefined)
  }
}
