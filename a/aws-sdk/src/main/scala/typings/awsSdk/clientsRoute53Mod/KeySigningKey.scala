package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySigningKey extends StObject {
  
  /**
    * The date when the key-signing key (KSK) was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string that represents a DNSKEY record.
    */
  var DNSKEYRecord: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * A string that represents a delegation signer (DS) record.
    */
  var DSRecord: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by RFC-8624 Section 3.3. 
    */
  var DigestAlgorithmMnemonic: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by RFC-8624 Section 3.3.
    */
  var DigestAlgorithmType: js.UndefOr[SigningKeyInteger] = js.undefined
  
  /**
    * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
    */
  var DigestValue: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
    */
  var Flag: js.UndefOr[SigningKeyInteger] = js.undefined
  
  /**
    * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in RFC-4034 Appendix B.
    */
  var KeyTag: js.UndefOr[SigningKeyTag] = js.undefined
  
  /**
    * The Amazon resource name (ARN) used to identify the customer managed key in Key Management Service (KMS). The KmsArn must be unique for each key-signing key (KSK) in a single hosted zone. You must configure the customer managed key as follows:  Status  Enabled  Key spec  ECC_NIST_P256  Key usage  Sign and verify  Key policy  The key policy must give permission for the following actions:   DescribeKey   GetPublicKey   Sign   The key policy must also include the Amazon Route 53 service in the principal for your account. Specify the following:    "Service": "dnssec-route53.amazonaws.com"      For more information about working with the customer managed key in KMS, see Key Management Service concepts.
    */
  var KmsArn: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * The last time that the key-signing key (KSK) was changed.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string used to identify a key-signing key (KSK). Name can include numbers, letters, and underscores (_). Name must be unique for each key-signing key in the same hosted zone.
    */
  var Name: js.UndefOr[SigningKeyName] = js.undefined
  
  /**
    * The public key, represented as a Base64 encoding, as required by  RFC-4034 Page 5.
    */
  var PublicKey: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * A string used to represent the signing algorithm. This value must follow the guidelines provided by RFC-8624 Section 3.1. 
    */
  var SigningAlgorithmMnemonic: js.UndefOr[SigningKeyString] = js.undefined
  
  /**
    * An integer used to represent the signing algorithm. This value must follow the guidelines provided by RFC-8624 Section 3.1. 
    */
  var SigningAlgorithmType: js.UndefOr[SigningKeyInteger] = js.undefined
  
  /**
    * A string that represents the current key-signing key (KSK) status. Status can have one of the following values:  ACTIVE  The KSK is being used for signing.  INACTIVE  The KSK is not being used for signing.  DELETING  The KSK is in the process of being deleted.  ACTION_NEEDED  There is a problem with the KSK that requires you to take action to resolve. For example, the customer managed key might have been deleted, or the permissions for the customer managed key might have been changed.  INTERNAL_FAILURE  There was an error during a request. Before you can continue to work with DNSSEC signing, including actions that involve this KSK, you must correct the problem. For example, you may need to activate or deactivate the KSK.  
    */
  var Status: js.UndefOr[SigningKeyStatus] = js.undefined
  
  /**
    * The status message provided for the following key-signing key (KSK) statuses: ACTION_NEEDED or INTERNAL_FAILURE. The status message includes information about what the problem might be and steps that you can take to correct the issue.
    */
  var StatusMessage: js.UndefOr[SigningKeyStatusMessage] = js.undefined
}
object KeySigningKey {
  
  inline def apply(): KeySigningKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeySigningKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySigningKey] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDNSKEYRecord(value: SigningKeyString): Self = StObject.set(x, "DNSKEYRecord", value.asInstanceOf[js.Any])
    
    inline def setDNSKEYRecordUndefined: Self = StObject.set(x, "DNSKEYRecord", js.undefined)
    
    inline def setDSRecord(value: SigningKeyString): Self = StObject.set(x, "DSRecord", value.asInstanceOf[js.Any])
    
    inline def setDSRecordUndefined: Self = StObject.set(x, "DSRecord", js.undefined)
    
    inline def setDigestAlgorithmMnemonic(value: SigningKeyString): Self = StObject.set(x, "DigestAlgorithmMnemonic", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmMnemonicUndefined: Self = StObject.set(x, "DigestAlgorithmMnemonic", js.undefined)
    
    inline def setDigestAlgorithmType(value: SigningKeyInteger): Self = StObject.set(x, "DigestAlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmTypeUndefined: Self = StObject.set(x, "DigestAlgorithmType", js.undefined)
    
    inline def setDigestValue(value: SigningKeyString): Self = StObject.set(x, "DigestValue", value.asInstanceOf[js.Any])
    
    inline def setDigestValueUndefined: Self = StObject.set(x, "DigestValue", js.undefined)
    
    inline def setFlag(value: SigningKeyInteger): Self = StObject.set(x, "Flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "Flag", js.undefined)
    
    inline def setKeyTag(value: SigningKeyTag): Self = StObject.set(x, "KeyTag", value.asInstanceOf[js.Any])
    
    inline def setKeyTagUndefined: Self = StObject.set(x, "KeyTag", js.undefined)
    
    inline def setKmsArn(value: SigningKeyString): Self = StObject.set(x, "KmsArn", value.asInstanceOf[js.Any])
    
    inline def setKmsArnUndefined: Self = StObject.set(x, "KmsArn", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: SigningKeyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPublicKey(value: SigningKeyString): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    inline def setSigningAlgorithmMnemonic(value: SigningKeyString): Self = StObject.set(x, "SigningAlgorithmMnemonic", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmMnemonicUndefined: Self = StObject.set(x, "SigningAlgorithmMnemonic", js.undefined)
    
    inline def setSigningAlgorithmType(value: SigningKeyInteger): Self = StObject.set(x, "SigningAlgorithmType", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmTypeUndefined: Self = StObject.set(x, "SigningAlgorithmType", js.undefined)
    
    inline def setStatus(value: SigningKeyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: SigningKeyStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
