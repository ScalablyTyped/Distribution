package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentData extends StObject {
  
  /**
    * The data binding information for the component's properties.
    */
  var bindingProperties: js.UndefOr[ComponentBindingProperties] = js.undefined
  
  /**
    * The components that are instances of the main component.
    */
  var children: js.UndefOr[ComponentChildList] = js.undefined
  
  /**
    * The configuration for binding a component's properties to a data model. Use this for a collection component.
    */
  var collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined
  
  /**
    * The type of the component. This can be an Amplify custom UI component or another custom component.
    */
  var componentType: js.UndefOr[ComponentType] = js.undefined
  
  /**
    * The event configuration for the component. Use for the workflow feature in Amplify Studio that allows you to bind events and actions to components.
    */
  var events: js.UndefOr[ComponentEvents] = js.undefined
  
  /**
    * The unique ID of the component to update.
    */
  var id: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The name of the component to update.
    */
  var name: js.UndefOr[ComponentName] = js.undefined
  
  /**
    * Describes the properties that can be overriden to customize the component.
    */
  var overrides: js.UndefOr[ComponentOverrides] = js.undefined
  
  /**
    * Describes the component's properties.
    */
  var properties: js.UndefOr[ComponentProperties] = js.undefined
  
  /**
    * The schema version of the component when it was imported.
    */
  var schemaVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the component in its original source system, such as Figma.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the unique variants of the main component being updated.
    */
  var variants: js.UndefOr[ComponentVariants] = js.undefined
}
object UpdateComponentData {
  
  inline def apply(): UpdateComponentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateComponentData]
  }
  
  extension [Self <: UpdateComponentData](x: Self) {
    
    inline def setBindingProperties(value: ComponentBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setChildren(value: ComponentChildList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollectionProperties(value: ComponentCollectionProperties): Self = StObject.set(x, "collectionProperties", value.asInstanceOf[js.Any])
    
    inline def setCollectionPropertiesUndefined: Self = StObject.set(x, "collectionProperties", js.undefined)
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeUndefined: Self = StObject.set(x, "componentType", js.undefined)
    
    inline def setEvents(value: ComponentEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ComponentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverrides(value: ComponentOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setVariants(value: ComponentVariants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: ComponentVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
