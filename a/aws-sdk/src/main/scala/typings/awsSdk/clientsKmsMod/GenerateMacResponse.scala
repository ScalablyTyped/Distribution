package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMacResponse extends StObject {
  
  /**
    * The HMAC KMS key used in the operation.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS key, and MAC algorithm. This is the standard, raw HMAC defined in RFC 2104.
    */
  var Mac: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The MAC algorithm that was used to generate the HMAC.
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec] = js.undefined
}
object GenerateMacResponse {
  
  inline def apply(): GenerateMacResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMacResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateMacResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMac(value: CiphertextType): Self = StObject.set(x, "Mac", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "Mac", js.undefined)
  }
}
