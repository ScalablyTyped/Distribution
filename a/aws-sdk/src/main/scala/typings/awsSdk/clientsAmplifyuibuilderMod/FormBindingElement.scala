package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormBindingElement extends StObject {
  
  /**
    * The name of the component to retrieve a value from.
    */
  var element: String
  
  /**
    * The property to retrieve a value from.
    */
  var property: String
}
object FormBindingElement {
  
  inline def apply(element: String, property: String): FormBindingElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormBindingElement]
  }
  
  extension [Self <: FormBindingElement](x: Self) {
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
