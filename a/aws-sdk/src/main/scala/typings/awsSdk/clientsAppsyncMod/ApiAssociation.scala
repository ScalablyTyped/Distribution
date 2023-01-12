package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiAssociation extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the status of an association.    PROCESSING: The API association is being created. You cannot modify association requests during processing.    SUCCESS: The API association was successful. You can modify associations after success.    FAILED: The API association has failed. You can modify associations after failure.  
    */
  var associationStatus: js.UndefOr[AssociationStatus] = js.undefined
  
  /**
    * Details about the last deployment status.
    */
  var deploymentDetail: js.UndefOr[String] = js.undefined
  
  /**
    * The domain name.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
}
object ApiAssociation {
  
  inline def apply(): ApiAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiAssociation] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    inline def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "associationStatus", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusUndefined: Self = StObject.set(x, "associationStatus", js.undefined)
    
    inline def setDeploymentDetail(value: String): Self = StObject.set(x, "deploymentDetail", value.asInstanceOf[js.Any])
    
    inline def setDeploymentDetailUndefined: Self = StObject.set(x, "deploymentDetail", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
  }
}
