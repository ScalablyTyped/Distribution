package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersForImportResponse extends StObject {
  
  /**
    * The import token to send in a subsequent ImportKeyMaterial request.
    */
  var ImportToken: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key to use in a subsequent ImportKeyMaterial request. This is the same KMS key specified in the GetParametersForImport request.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an ImportKeyMaterial request and you must send another GetParametersForImport request to get new ones.
    */
  var ParametersValidTo: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The public key to use to encrypt the key material before importing it with ImportKeyMaterial.
    */
  var PublicKey: js.UndefOr[PlaintextType] = js.undefined
}
object GetParametersForImportResponse {
  
  inline def apply(): GetParametersForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersForImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersForImportResponse] (val x: Self) extends AnyVal {
    
    inline def setImportToken(value: CiphertextType): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
    
    inline def setImportTokenUndefined: Self = StObject.set(x, "ImportToken", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setParametersValidTo(value: js.Date): Self = StObject.set(x, "ParametersValidTo", value.asInstanceOf[js.Any])
    
    inline def setParametersValidToUndefined: Self = StObject.set(x, "ParametersValidTo", js.undefined)
    
    inline def setPublicKey(value: PlaintextType): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
