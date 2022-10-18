package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelKeyDeletionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key whose deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object CancelKeyDeletionResponse {
  
  inline def apply(): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
  
  extension [Self <: CancelKeyDeletionResponse](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
