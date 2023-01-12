package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationActionSetStateParameter extends StObject {
  
  /**
    * The name of the component that is being modified.
    */
  var componentName: String
  
  /**
    * The name of the component property to apply the state configuration to.
    */
  var property: String
  
  /**
    * The state configuration to assign to the property.
    */
  var set: ComponentProperty
}
object MutationActionSetStateParameter {
  
  inline def apply(componentName: String, property: String, set: ComponentProperty): MutationActionSetStateParameter = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationActionSetStateParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationActionSetStateParameter] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setSet(value: ComponentProperty): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
