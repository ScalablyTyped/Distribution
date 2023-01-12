package typings.activexLibreoffice.com_.sun.star.xml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A struct to keep information of an element's attribute. */
trait FastAttribute extends StObject {
  
  /** the token corresponding to the attribute */
  var Token: Double
  
  /** the attribute value */
  var Value: String
}
object FastAttribute {
  
  inline def apply(Token: Double, Value: String): FastAttribute = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastAttribute] (val x: Self) extends AnyVal {
    
    inline def setToken(value: Double): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
