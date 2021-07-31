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
  
  @scala.inline
  def apply(attribute: String, value: String): ConfigTuple = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTuple]
  }
  
  @scala.inline
  implicit class ConfigTupleMutableBuilder[Self <: ConfigTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
