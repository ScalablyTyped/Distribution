package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentData extends StObject {
  
  /**
    * The data binding information for the component's properties.
    */
  var bindingProperties: ComponentBindingProperties
  
  /**
    * A list of child components that are instances of the main component.
    */
  var children: js.UndefOr[ComponentChildList] = js.undefined
  
  /**
    * The data binding configuration for customizing a component's properties. Use this for a collection component.
    */
  var collectionProperties: js.UndefOr[ComponentCollectionProperties] = js.undefined
  
  /**
    * The component type. This can be an Amplify custom UI component or another custom component.
    */
  var componentType: ComponentType
  
  /**
    * The event configuration for the component. Use for the workflow feature in Amplify Studio that allows you to bind events and actions to components.
    */
  var events: js.UndefOr[ComponentEvents] = js.undefined
  
  /**
    * The name of the component
    */
  var name: ComponentName
  
  /**
    * Describes the component properties that can be overriden to customize an instance of the component.
    */
  var overrides: ComponentOverrides
  
  /**
    * Describes the component's properties.
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
    * One or more key-value pairs to use when tagging the component data.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A list of the unique variants of this component.
    */
  var variants: ComponentVariants
}
object CreateComponentData {
  
  inline def apply(
    bindingProperties: ComponentBindingProperties,
    componentType: ComponentType,
    name: ComponentName,
    overrides: ComponentOverrides,
    properties: ComponentProperties,
    variants: ComponentVariants
  ): CreateComponentData = {
    val __obj = js.Dynamic.literal(bindingProperties = bindingProperties.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentData]
  }
  
  extension [Self <: CreateComponentData](x: Self) {
    
    inline def setBindingProperties(value: ComponentBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ComponentChildList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollectionProperties(value: ComponentCollectionProperties): Self = StObject.set(x, "collectionProperties", value.asInstanceOf[js.Any])
    
    inline def setCollectionPropertiesUndefined: Self = StObject.set(x, "collectionProperties", js.undefined)
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: ComponentEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
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
