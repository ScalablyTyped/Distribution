package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageInfo extends StObject {
  
  /**
    * 
    EBS volume information.
    
    */
  var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
}
object StorageInfo {
  
  inline def apply(): StorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageInfo]
  }
  
  extension [Self <: StorageInfo](x: Self) {
    
    inline def setEbsStorageInfo(value: EBSStorageInfo): Self = StObject.set(x, "EbsStorageInfo", value.asInstanceOf[js.Any])
    
    inline def setEbsStorageInfoUndefined: Self = StObject.set(x, "EbsStorageInfo", js.undefined)
  }
}
