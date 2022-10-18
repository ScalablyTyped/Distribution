package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRequirementsWithMetadataRequest extends StObject {
  
  /**
    * The architecture type.
    */
  var ArchitectureTypes: js.UndefOr[ArchitectureTypeSet] = js.undefined
  
  /**
    * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with those attributes.
    */
  var InstanceRequirements: js.UndefOr[InstanceRequirementsRequest] = js.undefined
  
  /**
    * The virtualization type.
    */
  var VirtualizationTypes: js.UndefOr[VirtualizationTypeSet] = js.undefined
}
object InstanceRequirementsWithMetadataRequest {
  
  inline def apply(): InstanceRequirementsWithMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRequirementsWithMetadataRequest]
  }
  
  extension [Self <: InstanceRequirementsWithMetadataRequest](x: Self) {
    
    inline def setArchitectureTypes(value: ArchitectureTypeSet): Self = StObject.set(x, "ArchitectureTypes", value.asInstanceOf[js.Any])
    
    inline def setArchitectureTypesUndefined: Self = StObject.set(x, "ArchitectureTypes", js.undefined)
    
    inline def setArchitectureTypesVarargs(value: ArchitectureType*): Self = StObject.set(x, "ArchitectureTypes", js.Array(value*))
    
    inline def setInstanceRequirements(value: InstanceRequirementsRequest): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsUndefined: Self = StObject.set(x, "InstanceRequirements", js.undefined)
    
    inline def setVirtualizationTypes(value: VirtualizationTypeSet): Self = StObject.set(x, "VirtualizationTypes", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypesUndefined: Self = StObject.set(x, "VirtualizationTypes", js.undefined)
    
    inline def setVirtualizationTypesVarargs(value: VirtualizationType*): Self = StObject.set(x, "VirtualizationTypes", js.Array(value*))
  }
}
