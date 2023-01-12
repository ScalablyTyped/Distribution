package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionParameters extends StObject {
  
  /**
    * The HTML anchor link to the location to open. Specify this value for a navigation action.
    */
  var anchor: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the action performs an operation on an Amplify DataStore model.
    */
  var fields: js.UndefOr[ComponentProperties] = js.undefined
  
  /**
    * Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
    */
  var global: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * The unique ID of the component that the ActionParameters apply to.
    */
  var id: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * A key-value pair that specifies the state property name and its initial value.
    */
  var state: js.UndefOr[MutationActionSetStateParameter] = js.undefined
  
  /**
    * The element within the same component to modify when the action occurs.
    */
  var target: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * The type of navigation action. Valid values are url and anchor. This value is required for a navigation action.
    */
  var `type`: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * The URL to the location to open. Specify this value for a navigation action.
    */
  var url: js.UndefOr[ComponentProperty] = js.undefined
}
object ActionParameters {
  
  inline def apply(): ActionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionParameters] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: ComponentProperty): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setFields(value: ComponentProperties): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setGlobal(value: ComponentProperty): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setId(value: ComponentProperty): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setState(value: MutationActionSetStateParameter): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTarget(value: ComponentProperty): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: ComponentProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: ComponentProperty): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
