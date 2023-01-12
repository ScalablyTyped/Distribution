package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends StObject {
  
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.FailedServiceActionAssociations] = js.undefined
}
object BatchAssociateServiceActionWithProvisioningArtifactOutput {
  
  inline def apply(): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAssociateServiceActionWithProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    inline def setFailedServiceActionAssociations(value: FailedServiceActionAssociations): Self = StObject.set(x, "FailedServiceActionAssociations", value.asInstanceOf[js.Any])
    
    inline def setFailedServiceActionAssociationsUndefined: Self = StObject.set(x, "FailedServiceActionAssociations", js.undefined)
    
    inline def setFailedServiceActionAssociationsVarargs(value: FailedServiceActionAssociation*): Self = StObject.set(x, "FailedServiceActionAssociations", js.Array(value*))
  }
}
