package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningProfileRevocationRecord extends StObject {
  
  /**
    * The time when revocation becomes effective.
    */
  var revocationEffectiveFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the signing profile was revoked.
    */
  var revokedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identity of the revoker.
    */
  var revokedBy: js.UndefOr[String] = js.undefined
}
object SigningProfileRevocationRecord {
  
  inline def apply(): SigningProfileRevocationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfileRevocationRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigningProfileRevocationRecord] (val x: Self) extends AnyVal {
    
    inline def setRevocationEffectiveFrom(value: js.Date): Self = StObject.set(x, "revocationEffectiveFrom", value.asInstanceOf[js.Any])
    
    inline def setRevocationEffectiveFromUndefined: Self = StObject.set(x, "revocationEffectiveFrom", js.undefined)
    
    inline def setRevokedAt(value: js.Date): Self = StObject.set(x, "revokedAt", value.asInstanceOf[js.Any])
    
    inline def setRevokedAtUndefined: Self = StObject.set(x, "revokedAt", js.undefined)
    
    inline def setRevokedBy(value: String): Self = StObject.set(x, "revokedBy", value.asInstanceOf[js.Any])
    
    inline def setRevokedByUndefined: Self = StObject.set(x, "revokedBy", js.undefined)
  }
}
