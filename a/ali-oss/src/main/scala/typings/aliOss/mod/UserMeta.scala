package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see x-oss-meta-* in https://help.aliyun.com/document_detail/31978.html for Aliyun user
  * @see x-oss-meta-* in https://www.alibabacloud.com/help/en/doc-detail/31978.html for AlibabaCloud user
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: string | number} */ trait UserMeta extends StObject {
  
  var pid: Double
  
  var uid: Double
}
object UserMeta {
  
  inline def apply(pid: Double, uid: Double): UserMeta = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMeta]
  }
  
  extension [Self <: UserMeta](x: Self) {
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
