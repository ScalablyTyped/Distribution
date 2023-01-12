package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyUsage extends StObject {
  
  /**
    * Key can be used to sign CRLs.
    */
  var CRLSign: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used to decipher data.
    */
  var DataEncipherment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used only to decipher data.
    */
  var DecipherOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Key can be used for digital signing.
    */
  var DigitalSignature: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used only to encipher data.
    */
  var EncipherOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used in a key-agreement protocol.
    */
  var KeyAgreement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used to sign certificates.
    */
  var KeyCertSign: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used to encipher data.
    */
  var KeyEncipherment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Key can be used for non-repudiation.
    */
  var NonRepudiation: js.UndefOr[Boolean] = js.undefined
}
object KeyUsage {
  
  inline def apply(): KeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
    inline def setCRLSign(value: Boolean): Self = StObject.set(x, "CRLSign", value.asInstanceOf[js.Any])
    
    inline def setCRLSignUndefined: Self = StObject.set(x, "CRLSign", js.undefined)
    
    inline def setDataEncipherment(value: Boolean): Self = StObject.set(x, "DataEncipherment", value.asInstanceOf[js.Any])
    
    inline def setDataEnciphermentUndefined: Self = StObject.set(x, "DataEncipherment", js.undefined)
    
    inline def setDecipherOnly(value: Boolean): Self = StObject.set(x, "DecipherOnly", value.asInstanceOf[js.Any])
    
    inline def setDecipherOnlyUndefined: Self = StObject.set(x, "DecipherOnly", js.undefined)
    
    inline def setDigitalSignature(value: Boolean): Self = StObject.set(x, "DigitalSignature", value.asInstanceOf[js.Any])
    
    inline def setDigitalSignatureUndefined: Self = StObject.set(x, "DigitalSignature", js.undefined)
    
    inline def setEncipherOnly(value: Boolean): Self = StObject.set(x, "EncipherOnly", value.asInstanceOf[js.Any])
    
    inline def setEncipherOnlyUndefined: Self = StObject.set(x, "EncipherOnly", js.undefined)
    
    inline def setKeyAgreement(value: Boolean): Self = StObject.set(x, "KeyAgreement", value.asInstanceOf[js.Any])
    
    inline def setKeyAgreementUndefined: Self = StObject.set(x, "KeyAgreement", js.undefined)
    
    inline def setKeyCertSign(value: Boolean): Self = StObject.set(x, "KeyCertSign", value.asInstanceOf[js.Any])
    
    inline def setKeyCertSignUndefined: Self = StObject.set(x, "KeyCertSign", js.undefined)
    
    inline def setKeyEncipherment(value: Boolean): Self = StObject.set(x, "KeyEncipherment", value.asInstanceOf[js.Any])
    
    inline def setKeyEnciphermentUndefined: Self = StObject.set(x, "KeyEncipherment", js.undefined)
    
    inline def setNonRepudiation(value: Boolean): Self = StObject.set(x, "NonRepudiation", value.asInstanceOf[js.Any])
    
    inline def setNonRepudiationUndefined: Self = StObject.set(x, "NonRepudiation", js.undefined)
  }
}
