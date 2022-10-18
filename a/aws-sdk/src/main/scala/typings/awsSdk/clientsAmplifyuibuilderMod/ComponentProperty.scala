package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentProperty extends StObject {
  
  /**
    * The information to bind the component property to data at runtime.
    */
  var bindingProperties: js.UndefOr[ComponentPropertyBindingProperties] = js.undefined
  
  /**
    * The information to bind the component property to form data.
    */
  var bindings: js.UndefOr[FormBindings] = js.undefined
  
  /**
    * The information to bind the component property to data at runtime. Use this for collection components.
    */
  var collectionBindingProperties: js.UndefOr[ComponentPropertyBindingProperties] = js.undefined
  
  /**
    * The name of the component that is affected by an event.
    */
  var componentName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of component properties to concatenate to create the value to assign to this component property.
    */
  var concat: js.UndefOr[ComponentPropertyList] = js.undefined
  
  /**
    * The conditional expression to use to assign a value to the component property.
    */
  var condition: js.UndefOr[ComponentConditionProperty] = js.undefined
  
  /**
    * Specifies whether the user configured the property in Amplify Studio after importing it.
    */
  var configured: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default value to assign to the component property.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * An event that occurs in your app. Use this for workflow data binding.
    */
  var event: js.UndefOr[String] = js.undefined
  
  /**
    * The default value assigned to the property when the component is imported into an app.
    */
  var importedValue: js.UndefOr[String] = js.undefined
  
  /**
    * The data model to use to assign a value to the component property.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the component's property that is affected by an event.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * The component type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * An authenticated user attribute to use to assign a value to the component property.
    */
  var userAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The value to assign to the component property.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ComponentProperty {
  
  inline def apply(): ComponentProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentProperty]
  }
  
  extension [Self <: ComponentProperty](x: Self) {
    
    inline def setBindingProperties(value: ComponentPropertyBindingProperties): Self = StObject.set(x, "bindingProperties", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertiesUndefined: Self = StObject.set(x, "bindingProperties", js.undefined)
    
    inline def setBindings(value: FormBindings): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setCollectionBindingProperties(value: ComponentPropertyBindingProperties): Self = StObject.set(x, "collectionBindingProperties", value.asInstanceOf[js.Any])
    
    inline def setCollectionBindingPropertiesUndefined: Self = StObject.set(x, "collectionBindingProperties", js.undefined)
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setConcat(value: ComponentPropertyList): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setConcatVarargs(value: ComponentProperty*): Self = StObject.set(x, "concat", js.Array(value*))
    
    inline def setCondition(value: ComponentConditionProperty): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "configured", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setImportedValue(value: String): Self = StObject.set(x, "importedValue", value.asInstanceOf[js.Any])
    
    inline def setImportedValueUndefined: Self = StObject.set(x, "importedValue", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserAttribute(value: String): Self = StObject.set(x, "userAttribute", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeUndefined: Self = StObject.set(x, "userAttribute", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
