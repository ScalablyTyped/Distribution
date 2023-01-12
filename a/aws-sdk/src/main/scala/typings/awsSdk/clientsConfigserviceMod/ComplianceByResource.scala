package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceByResource extends StObject {
  
  /**
    * Indicates whether the Amazon Web Services resource complies with all of the Config rules that evaluated it.
    */
  var Compliance: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Compliance] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource that was evaluated.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object ComplianceByResource {
  
  inline def apply(): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceByResource] (val x: Self) extends AnyVal {
    
    inline def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
