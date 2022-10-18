package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioComponentSummary extends StObject {
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that created the studio component.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[StudioComponentDescription] = js.undefined
  
  /**
    * The name for the studio component.
    */
  var name: js.UndefOr[StudioComponentName] = js.undefined
  
  /**
    * The unique identifier for a studio component resource.
    */
  var studioComponentId: js.UndefOr[StudioComponentId] = js.undefined
  
  /**
    * The specific subtype of a studio component.
    */
  var subtype: js.UndefOr[StudioComponentSubtype] = js.undefined
  
  /**
    * The type of the studio component.
    */
  var `type`: js.UndefOr[StudioComponentType] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user ID of the user that most recently updated the resource.
    */
  var updatedBy: js.UndefOr[String] = js.undefined
}
object StudioComponentSummary {
  
  inline def apply(): StudioComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioComponentSummary]
  }
  
  extension [Self <: StudioComponentSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: StudioComponentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: StudioComponentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStudioComponentId(value: StudioComponentId): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdUndefined: Self = StObject.set(x, "studioComponentId", js.undefined)
    
    inline def setSubtype(value: StudioComponentSubtype): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: StudioComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
  }
}
