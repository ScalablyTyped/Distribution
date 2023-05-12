package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateServiceActionWithProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typings.awsSdk.clientsServicecatalogMod.ServiceActionAssociations
}
object BatchAssociateServiceActionWithProvisioningArtifactInput {
  
  inline def apply(ServiceActionAssociations: ServiceActionAssociations): BatchAssociateServiceActionWithProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAssociateServiceActionWithProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setServiceActionAssociations(value: ServiceActionAssociations): Self = StObject.set(x, "ServiceActionAssociations", value.asInstanceOf[js.Any])
    
    inline def setServiceActionAssociationsVarargs(value: ServiceActionAssociation*): Self = StObject.set(x, "ServiceActionAssociations", js.Array(value*))
  }
}
