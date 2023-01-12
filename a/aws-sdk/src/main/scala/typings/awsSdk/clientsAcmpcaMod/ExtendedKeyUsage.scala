package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedKeyUsage extends StObject {
  
  /**
    * Specifies a custom ExtendedKeyUsage with an object identifier (OID).
    */
  var ExtendedKeyUsageObjectIdentifier: js.UndefOr[CustomObjectIdentifier] = js.undefined
  
  /**
    * Specifies a standard ExtendedKeyUsage as defined as in RFC 5280.
    */
  var ExtendedKeyUsageType: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.ExtendedKeyUsageType] = js.undefined
}
object ExtendedKeyUsage {
  
  inline def apply(): ExtendedKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedKeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedKeyUsage] (val x: Self) extends AnyVal {
    
    inline def setExtendedKeyUsageObjectIdentifier(value: CustomObjectIdentifier): Self = StObject.set(x, "ExtendedKeyUsageObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageObjectIdentifierUndefined: Self = StObject.set(x, "ExtendedKeyUsageObjectIdentifier", js.undefined)
    
    inline def setExtendedKeyUsageType(value: ExtendedKeyUsageType): Self = StObject.set(x, "ExtendedKeyUsageType", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageTypeUndefined: Self = StObject.set(x, "ExtendedKeyUsageType", js.undefined)
  }
}
