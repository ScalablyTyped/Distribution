package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionMapInputValue extends StObject {
  
  /**
    * The KMS key used to encrypt the data in your replication set.
    */
  var sseKmsKeyId: js.UndefOr[SseKmsKey] = js.undefined
}
object RegionMapInputValue {
  
  inline def apply(): RegionMapInputValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionMapInputValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionMapInputValue] (val x: Self) extends AnyVal {
    
    inline def setSseKmsKeyId(value: SseKmsKey): Self = StObject.set(x, "sseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseKmsKeyIdUndefined: Self = StObject.set(x, "sseKmsKeyId", js.undefined)
  }
}
