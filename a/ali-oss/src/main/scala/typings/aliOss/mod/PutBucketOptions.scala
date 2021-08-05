package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketOptions extends StObject {
  
  var storageClass: StorageType
  
  var timeout: Double
}
object PutBucketOptions {
  
  inline def apply(storageClass: StorageType, timeout: Double): PutBucketOptions = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketOptions]
  }
  
  extension [Self <: PutBucketOptions](x: Self) {
    
    inline def setStorageClass(value: StorageType): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
