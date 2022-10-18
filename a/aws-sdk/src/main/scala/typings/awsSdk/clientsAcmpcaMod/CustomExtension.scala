package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomExtension extends StObject {
  
  /**
    *  Specifies the critical flag of the X.509 extension.
    */
  var Critical: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies the object identifier (OID) of the X.509 extension. For more information, see the Global OID reference database. 
    */
  var ObjectIdentifier: CustomObjectIdentifier
  
  /**
    *  Specifies the base64-encoded value of the X.509 extension.
    */
  var Value: Base64String1To4096
}
object CustomExtension {
  
  inline def apply(ObjectIdentifier: CustomObjectIdentifier, Value: Base64String1To4096): CustomExtension = {
    val __obj = js.Dynamic.literal(ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomExtension]
  }
  
  extension [Self <: CustomExtension](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "Critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "Critical", js.undefined)
    
    inline def setObjectIdentifier(value: CustomObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Base64String1To4096): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
