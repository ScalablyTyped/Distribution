package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAttribute extends StObject {
  
  /**
    * Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
    */
  var ObjectIdentifier: CustomObjectIdentifier
  
  /**
    *  Specifies the attribute value of relative distinguished name (RDN).
    */
  var Value: String1To256
}
object CustomAttribute {
  
  inline def apply(ObjectIdentifier: CustomObjectIdentifier, Value: String1To256): CustomAttribute = {
    val __obj = js.Dynamic.literal(ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomAttribute] (val x: Self) extends AnyVal {
    
    inline def setObjectIdentifier(value: CustomObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String1To256): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
