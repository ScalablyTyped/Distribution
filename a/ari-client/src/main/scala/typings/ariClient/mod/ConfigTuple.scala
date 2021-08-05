package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigTuple extends StObject {
  
  /**
    * A configuration object attribute.
    */
  var attribute: String
  
  /**
    * The value for the attribute.
    */
  var value: String
}
object ConfigTuple {
  
  inline def apply(attribute: String, value: String): ConfigTuple = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTuple]
  }
  
  extension [Self <: ConfigTuple](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
