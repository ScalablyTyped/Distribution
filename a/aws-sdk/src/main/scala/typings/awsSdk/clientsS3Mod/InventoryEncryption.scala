package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryEncryption extends StObject {
  
  /**
    * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
    */
  var SSEKMS: js.UndefOr[typings.awsSdk.clientsS3Mod.SSEKMS] = js.undefined
  
  /**
    * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
    */
  var SSES3: js.UndefOr[typings.awsSdk.clientsS3Mod.SSES3] = js.undefined
}
object InventoryEncryption {
  
  inline def apply(): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryEncryption]
  }
  
  extension [Self <: InventoryEncryption](x: Self) {
    
    inline def setSSEKMS(value: SSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
    
    inline def setSSES3(value: SSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
    
    inline def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
  }
}
