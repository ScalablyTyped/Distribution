package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a pair assembled from a name and a value. */
trait NamedValue extends StObject {
  
  /** specifies the name part of the pair */
  var Name: String
  
  /** specifies the value part of the pair. */
  var Value: js.Any
}
object NamedValue {
  
  inline def apply(Name: String, Value: js.Any): NamedValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedValue]
  }
  
  extension [Self <: NamedValue](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
