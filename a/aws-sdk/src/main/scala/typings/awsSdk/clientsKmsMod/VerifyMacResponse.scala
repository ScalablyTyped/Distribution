package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyMacResponse extends StObject {
  
  /**
    * The HMAC KMS key used in the verification.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The MAC algorithm used in the verification.
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec] = js.undefined
  
  /**
    * A Boolean value that indicates whether the HMAC was verified. A value of True indicates that the HMAC (Mac) was generated with the specified Message, HMAC KMS key (KeyID) and MacAlgorithm.. If the HMAC is not verified, the VerifyMac operation fails with a KMSInvalidMacException exception. This exception indicates that one or more of the inputs changed since the HMAC was computed.
    */
  var MacValid: js.UndefOr[BooleanType] = js.undefined
}
object VerifyMacResponse {
  
  inline def apply(): VerifyMacResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyMacResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyMacResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMacValid(value: BooleanType): Self = StObject.set(x, "MacValid", value.asInstanceOf[js.Any])
    
    inline def setMacValidUndefined: Self = StObject.set(x, "MacValid", js.undefined)
  }
}
