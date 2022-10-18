package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResourceType extends StObject {
  
  /**
    * A description of the resource type.
    */
  var description: js.UndefOr[TargetResourceTypeDescription] = js.undefined
  
  /**
    * The parameters for the resource type.
    */
  var parameters: js.UndefOr[TargetResourceTypeParameterMap] = js.undefined
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
}
object TargetResourceType {
  
  inline def apply(): TargetResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResourceType]
  }
  
  extension [Self <: TargetResourceType](x: Self) {
    
    inline def setDescription(value: TargetResourceTypeDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setParameters(value: TargetResourceTypeParameterMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
