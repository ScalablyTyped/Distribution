package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedManifestEncryption extends StObject {
  
  /**
    * Configuration details on how SSE-KMS is used to encrypt generated manifest objects.
    */
  var SSEKMS: js.UndefOr[SSEKMSEncryption] = js.undefined
  
  /**
    * Specifies the use of SSE-S3 to encrypt generated manifest objects.
    */
  var SSES3: js.UndefOr[SSES3Encryption] = js.undefined
}
object GeneratedManifestEncryption {
  
  inline def apply(): GeneratedManifestEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedManifestEncryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedManifestEncryption] (val x: Self) extends AnyVal {
    
    inline def setSSEKMS(value: SSEKMSEncryption): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
    
    inline def setSSES3(value: SSES3Encryption): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
    
    inline def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
  }
}
