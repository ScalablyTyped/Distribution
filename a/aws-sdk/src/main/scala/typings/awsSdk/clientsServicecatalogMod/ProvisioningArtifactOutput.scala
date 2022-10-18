package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactOutput extends StObject {
  
  /**
    * Description of the provisioning artifact output key.
    */
  var Description: js.UndefOr[OutputDescription] = js.undefined
  
  /**
    * The provisioning artifact output key.
    */
  var Key: js.UndefOr[ProvisioningArtifactOutputKey] = js.undefined
}
object ProvisioningArtifactOutput {
  
  inline def apply(): ProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactOutput]
  }
  
  extension [Self <: ProvisioningArtifactOutput](x: Self) {
    
    inline def setDescription(value: OutputDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKey(value: ProvisioningArtifactOutputKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
