package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientInfo extends StObject {
  
  /**
    * The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public key.
    */
  var AttestationDocument: js.UndefOr[AttestationDocumentType] = js.undefined
  
  /**
    * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to encrypt plaintext values for the response. The only valid value is RSAES_OAEP_SHA_256.
    */
  var KeyEncryptionAlgorithm: js.UndefOr[KeyEncryptionMechanism] = js.undefined
}
object RecipientInfo {
  
  inline def apply(): RecipientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setAttestationDocument(value: AttestationDocumentType): Self = StObject.set(x, "AttestationDocument", value.asInstanceOf[js.Any])
    
    inline def setAttestationDocumentUndefined: Self = StObject.set(x, "AttestationDocument", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: KeyEncryptionMechanism): Self = StObject.set(x, "KeyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "KeyEncryptionAlgorithm", js.undefined)
  }
}
