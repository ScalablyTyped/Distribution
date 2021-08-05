package typings.aframe.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponents extends StObject {
  
  var defaultComponents: Material
  
  var mappings: StringDictionary[js.Any]
}
object DefaultComponents {
  
  inline def apply(defaultComponents: Material, mappings: StringDictionary[js.Any]): DefaultComponents = {
    val __obj = js.Dynamic.literal(defaultComponents = defaultComponents.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  
  extension [Self <: DefaultComponents](x: Self) {
    
    inline def setDefaultComponents(value: Material): Self = StObject.set(x, "defaultComponents", value.asInstanceOf[js.Any])
    
    inline def setMappings(value: StringDictionary[js.Any]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
