package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnssecSigningAttributes extends StObject {
  
  /**
    *  Algorithm which was used to generate the digest from the public key. 
    */
  var Algorithm: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK available. If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys only – use ZSK to create a DS record.
    */
  var Flags: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  The base64-encoded public key part of the key pair that is passed to the registry. 
    */
  var PublicKey: js.UndefOr[DnssecPublicKey] = js.undefined
}
object DnssecSigningAttributes {
  
  inline def apply(): DnssecSigningAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnssecSigningAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnssecSigningAttributes] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: NullableInteger): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setFlags(value: NullableInteger): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "Flags", js.undefined)
    
    inline def setPublicKey(value: DnssecPublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
