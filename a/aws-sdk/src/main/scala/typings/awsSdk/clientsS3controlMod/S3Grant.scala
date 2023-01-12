package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Grant extends StObject {
  
  /**
    * 
    */
  var Grantee: js.UndefOr[S3Grantee] = js.undefined
  
  /**
    * 
    */
  var Permission: js.UndefOr[S3Permission] = js.undefined
}
object S3Grant {
  
  inline def apply(): S3Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Grant] (val x: Self) extends AnyVal {
    
    inline def setGrantee(value: S3Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setPermission(value: S3Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
