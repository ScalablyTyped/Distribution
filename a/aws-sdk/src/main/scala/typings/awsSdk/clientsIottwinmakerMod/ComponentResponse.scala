package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentResponse extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The name of the property definition set in the request.
    */
  var definedIn: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An object that maps strings to the properties to set in the component type. Each string in the mapping must be unique to this object.
    */
  var properties: js.UndefOr[PropertyResponses] = js.undefined
  
  /**
    * The property groups.
    */
  var propertyGroups: js.UndefOr[ComponentPropertyGroupResponses] = js.undefined
  
  /**
    * The status of the component type.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The syncSource of the sync job, if this entity was created by a sync job.
    */
  var syncSource: js.UndefOr[SyncSource] = js.undefined
}
object ComponentResponse {
  
  inline def apply(): ComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentResponse] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setDefinedIn(value: String): Self = StObject.set(x, "definedIn", value.asInstanceOf[js.Any])
    
    inline def setDefinedInUndefined: Self = StObject.set(x, "definedIn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProperties(value: PropertyResponses): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertyGroups(value: ComponentPropertyGroupResponses): Self = StObject.set(x, "propertyGroups", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupsUndefined: Self = StObject.set(x, "propertyGroups", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setSyncSourceUndefined: Self = StObject.set(x, "syncSource", js.undefined)
  }
}
