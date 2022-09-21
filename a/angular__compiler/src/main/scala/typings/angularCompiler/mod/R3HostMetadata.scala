package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.ClassAttr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3HostMetadata extends StObject {
  
  /**
    * A mapping of attribute binding keys to `o.Expression`s.
    */
  var attributes: StringDictionary[Expression]
  
  /**
    * A mapping of event binding keys to unparsed expressions.
    */
  var listeners: StringDictionary[String]
  
  /**
    * A mapping of property binding keys to unparsed expressions.
    */
  var properties: StringDictionary[String]
  
  var specialAttributes: ClassAttr
}
object R3HostMetadata {
  
  inline def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: ClassAttr
  ): R3HostMetadata = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3HostMetadata]
  }
  
  extension [Self <: R3HostMetadata](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Expression]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSpecialAttributes(value: ClassAttr): Self = StObject.set(x, "specialAttributes", value.asInstanceOf[js.Any])
  }
}
