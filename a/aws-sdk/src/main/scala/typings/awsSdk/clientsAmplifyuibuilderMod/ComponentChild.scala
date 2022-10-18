package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentChild extends StObject {
  
  /**
    * The list of ComponentChild instances for this component.
    */
  var children: js.UndefOr[ComponentChildList] = js.undefined
  
  /**
    * The type of the child component. 
    */
  var componentType: String
  
  /**
    * Describes the events that can be raised on the child component. Use for the workflow feature in Amplify Studio that allows you to bind events and actions to components.
    */
  var events: js.UndefOr[ComponentEvents] = js.undefined
  
  /**
    * The name of the child component.
    */
  var name: String
  
  /**
    * Describes the properties of the child component. You can't specify tags as a valid property for properties.
    */
  var properties: ComponentProperties
  
  /**
    * The unique ID of the child component in its original source system, such as Figma.
    */
  var sourceId: js.UndefOr[String] = js.undefined
}
object ComponentChild {
  
  inline def apply(componentType: String, name: String, properties: ComponentProperties): ComponentChild = {
    val __obj = js.Dynamic.literal(componentType = componentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentChild]
  }
  
  extension [Self <: ComponentChild](x: Self) {
    
    inline def setChildren(value: ComponentChildList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComponentType(value: String): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: ComponentEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
  }
}
