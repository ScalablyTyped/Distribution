package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedServiceActionAssociation extends StObject {
  
  /**
    * The error code. Valid values are listed below.
    */
  var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined
  
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: js.UndefOr[Id] = js.undefined
}
object FailedServiceActionAssociation {
  
  inline def apply(): FailedServiceActionAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedServiceActionAssociation]
  }
  
  extension [Self <: FailedServiceActionAssociation](x: Self) {
    
    inline def setErrorCode(value: ServiceActionAssociationErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ServiceActionAssociationErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    inline def setServiceActionId(value: Id): Self = StObject.set(x, "ServiceActionId", value.asInstanceOf[js.Any])
    
    inline def setServiceActionIdUndefined: Self = StObject.set(x, "ServiceActionId", js.undefined)
  }
}
