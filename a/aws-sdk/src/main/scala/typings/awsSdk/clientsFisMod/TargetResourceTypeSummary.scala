package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResourceTypeSummary extends StObject {
  
  /**
    * A description of the resource type.
    */
  var description: js.UndefOr[TargetResourceTypeDescription] = js.undefined
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
}
object TargetResourceTypeSummary {
  
  inline def apply(): TargetResourceTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResourceTypeSummary]
  }
  
  extension [Self <: TargetResourceTypeSummary](x: Self) {
    
    inline def setDescription(value: TargetResourceTypeDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
