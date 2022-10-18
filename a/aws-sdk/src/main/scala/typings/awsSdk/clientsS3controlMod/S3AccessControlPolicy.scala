package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3AccessControlPolicy extends StObject {
  
  /**
    * 
    */
  var AccessControlList: js.UndefOr[S3AccessControlList] = js.undefined
  
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
}
object S3AccessControlPolicy {
  
  inline def apply(): S3AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3AccessControlPolicy]
  }
  
  extension [Self <: S3AccessControlPolicy](x: Self) {
    
    inline def setAccessControlList(value: S3AccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setCannedAccessControlList(value: S3CannedAccessControlList): Self = StObject.set(x, "CannedAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setCannedAccessControlListUndefined: Self = StObject.set(x, "CannedAccessControlList", js.undefined)
  }
}
