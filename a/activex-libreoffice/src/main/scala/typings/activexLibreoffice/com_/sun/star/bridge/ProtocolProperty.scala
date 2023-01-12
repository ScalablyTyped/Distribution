package typings.activexLibreoffice.com_.sun.star.bridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** string/value pair */
trait ProtocolProperty extends StObject {
  
  var Name: String
  
  var Value: Any
}
object ProtocolProperty {
  
  inline def apply(Name: String, Value: Any): ProtocolProperty = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolProperty] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
