package typings.activexLibreoffice.com_.sun.star.xml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A struct to keep information of an element's attribute. */
trait Attribute extends StObject {
  
  /** the attribute name */
  var Name: String
  
  /** the attribute namespace URL */
  var NamespaceURL: String
  
  /** the attribute value */
  var Value: String
}
object Attribute {
  
  inline def apply(Name: String, NamespaceURL: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NamespaceURL = NamespaceURL.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURL(value: String): Self = StObject.set(x, "NamespaceURL", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
