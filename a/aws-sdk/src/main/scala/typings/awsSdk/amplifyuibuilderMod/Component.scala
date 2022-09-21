package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * The unique ID of the Amplify app associated with the component.
    */
  var appId: String
  
  /**
    * The information to connect a component's properties to data at runtime. You can't specify tags as a valid property for bindingProperties. 
    */
  var bindingProperties: ComponentBindingProperties
  
  /**
    * A list of the component's ComponentChild instances.
    */
  var children: js.UndefOr[ComponentChildList] = js.undefined
  
  /**
    * The data binding configuration for the component's properties. Use this for a collection component. You can't specify tags as a valid property for collectionProperties.
    */
  var collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined
  
  /**
    * The type of the component. This can be an Amplify custom UI component or another custom component.
    */
  var componentType: ComponentType
  
  /**
    * The time that the component was created.
    */
  var createdAt: js.Date
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * Describes the events that can be raised on the component. Use for the workflow feature in Amplify Studio that allows you to bind events and actions to components.
    */
  var events: js.UndefOr[ComponentEvents] = js.undefined
  
  /**
    * The unique ID of the component.
    */
  var id: Uuid
  
  /**
    * The time that the component was modified.
    */
  var modifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the component.
    */
  var name: ComponentName
  
  /**
    * Describes the component's properties that can be overriden in a customized instance of the component. You can't specify tags as a valid property for overrides.
    */
  var overrides: ComponentOverrides
  
  /**
    * Describes the component's properties. You can't specify tags as a valid property for properties.
    */
  var properties: ComponentProperties
  
  /**
    * The schema version of the component when it was imported.
    */
  var schemaVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the component in its original source system, such as Figma.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * One or more key-value pairs to use when tagging the component.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A list of the component's variants. A variant is a unique style configuration of a main component.
    */
  var variants: ComponentVariants
}
object Component {
  
  inline def apply(
    appId: String,
    bindingProperties: ComponentBindingProperties,
    componentType: ComponentType,
    createdAt: js.Date,
    environmentName: String,
    id: Uuid,
    name: ComponentName,
    overrides: ComponentOverrides,
    properties: ComponentProperties,
    variants: ComponentVariants
  ): Component = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], bindingProperties = bindingProperties.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBindingProperties(value: ComponentBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ComponentChildList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollectionProperties(value: ComponentCollectionProperties): Self = StObject.set(x, "collectionProperties", value.asInstanceOf[js.Any])
    
    inline def setCollectionPropertiesUndefined: Self = StObject.set(x, "collectionProperties", js.undefined)
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: ComponentEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    inline def setName(value: ComponentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: ComponentOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVariants(value: ComponentVariants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsVarargs(value: ComponentVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
