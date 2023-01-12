package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLensDataExportEncryption extends StObject {
  
  /**
    * 
    */
  var SSEKMS: js.UndefOr[typings.awsSdk.clientsS3controlMod.SSEKMS] = js.undefined
  
  /**
    * 
    */
  var SSES3: js.UndefOr[typings.awsSdk.clientsS3controlMod.SSES3] = js.undefined
}
object StorageLensDataExportEncryption {
  
  inline def apply(): StorageLensDataExportEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageLensDataExportEncryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageLensDataExportEncryption] (val x: Self) extends AnyVal {
    
    inline def setSSEKMS(value: SSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
    
    inline def setSSES3(value: SSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
    
    inline def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
  }
}
