package typings.activexLibreoffice.com_.sun.star.xml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** store the type and value of an XML attribute inside a XNameContainer */
trait AttributeData extends StObject {
  
  /**
    * the namespace of this XML attribute.
    *
    * This string can be empty if you are not using namespaces.
    */
  var Namespace: String
  
  /**
    * the type of this XML attribute.
    *
    * For non validating parsers this must be CDATA.
    */
  var Type: String
  
  /** the string value of this XML attribute. */
  var Value: String
}
object AttributeData {
  
  inline def apply(Namespace: String, Type: String, Value: String): AttributeData = {
    val __obj = js.Dynamic.literal(Namespace = Namespace.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeData]
  }
  
  extension [Self <: AttributeData](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
