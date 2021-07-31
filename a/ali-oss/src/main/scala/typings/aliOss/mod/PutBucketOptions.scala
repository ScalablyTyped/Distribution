package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketOptions extends StObject {
  
  var storageClass: StorageType
  
  var timeout: Double
}
object PutBucketOptions {
  
  @scala.inline
  def apply(storageClass: StorageType, timeout: Double): PutBucketOptions = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketOptions]
  }
  
  @scala.inline
  implicit class PutBucketOptionsMutableBuilder[Self <: PutBucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageClass(value: StorageType): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
