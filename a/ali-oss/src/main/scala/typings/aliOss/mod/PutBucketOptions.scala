package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketOptions extends StObject {
  
  var acl: ACLType
  
  var dataRedundancyType: RedundancyType
  
  var storageClass: StorageType
  
  var timeout: Double
}
object PutBucketOptions {
  
  inline def apply(acl: ACLType, dataRedundancyType: RedundancyType, storageClass: StorageType, timeout: Double): PutBucketOptions = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], dataRedundancyType = dataRedundancyType.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutBucketOptions] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: ACLType): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setDataRedundancyType(value: RedundancyType): Self = StObject.set(x, "dataRedundancyType", value.asInstanceOf[js.Any])
    
    inline def setStorageClass(value: StorageType): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
