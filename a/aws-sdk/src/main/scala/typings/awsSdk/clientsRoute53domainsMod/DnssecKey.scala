package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnssecKey extends StObject {
  
  /**
    * The number of the public key’s cryptographic algorithm according to an IANA assignment.  If Route 53 is your DNS service, set this to 13. For more information about enabling DNSSEC signing, see Enabling DNSSEC signing and establishing a chain of trust.
    */
  var Algorithm: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  The delegation signer digest. Digest is calculated from the public key provided using specified digest algorithm and this digest is the actual value returned from the registry nameservers as the value of DS records. 
    */
  var Digest: js.UndefOr[String] = js.undefined
  
  /**
    *  The number of the DS digest algorithm according to an IANA assignment. For more information, see IANA for DNSSEC Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms. 
    */
  var DigestType: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Defines the type of key. It can be either a KSK (key-signing-key, value 257) or ZSK (zone-signing-key, value 256). Using KSK is always encouraged. Only use ZSK if your DNS provider isn't Route 53 and you don’t have KSK available. If you have KSK and ZSK keys, always use KSK to create a delegations signer (DS) record. If you have ZSK keys only – use ZSK to create a DS record.
    */
  var Flags: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  An ID assigned to each DS record created by AssociateDelegationSignerToDomain. 
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    *  A numeric identification of the DNSKEY record referred to by this DS record. 
    */
  var KeyTag: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The base64-encoded public key part of the key pair that is passed to the registry .
    */
  var PublicKey: js.UndefOr[DnssecPublicKey] = js.undefined
}
object DnssecKey {
  
  inline def apply(): DnssecKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnssecKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnssecKey] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: NullableInteger): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setDigest(value: String): Self = StObject.set(x, "Digest", value.asInstanceOf[js.Any])
    
    inline def setDigestType(value: NullableInteger): Self = StObject.set(x, "DigestType", value.asInstanceOf[js.Any])
    
    inline def setDigestTypeUndefined: Self = StObject.set(x, "DigestType", js.undefined)
    
    inline def setDigestUndefined: Self = StObject.set(x, "Digest", js.undefined)
    
    inline def setFlags(value: NullableInteger): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "Flags", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setKeyTag(value: NullableInteger): Self = StObject.set(x, "KeyTag", value.asInstanceOf[js.Any])
    
    inline def setKeyTagUndefined: Self = StObject.set(x, "KeyTag", js.undefined)
    
    inline def setPublicKey(value: DnssecPublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
