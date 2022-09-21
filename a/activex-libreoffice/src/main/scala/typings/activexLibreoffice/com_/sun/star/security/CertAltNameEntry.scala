package typings.activexLibreoffice.com_.sun.star.security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** struct contains a single entry within a Subject Alternative Name Extension of a X509 certificate. */
trait CertAltNameEntry extends StObject {
  
  /**
    * defines the type of the value . With this information you can determine how to interprete the Any value.
    * @see com.sun.star.security.ExtAltNameType
    */
  var Type: ExtAltNameType
  
  /** stores the value of entry. */
  var Value: Any
}
object CertAltNameEntry {
  
  inline def apply(Type: ExtAltNameType, Value: Any): CertAltNameEntry = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertAltNameEntry]
  }
  
  extension [Self <: CertAltNameEntry](x: Self) {
    
    inline def setType(value: ExtAltNameType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
