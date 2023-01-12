package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grant extends StObject {
  
  /**
    * The grantee.
    */
  var Grantee: js.UndefOr[typings.awsSdk.clientsGlacierMod.Grantee] = js.undefined
  
  /**
    * Specifies the permission given to the grantee. 
    */
  var Permission: js.UndefOr[typings.awsSdk.clientsGlacierMod.Permission] = js.undefined
}
object Grant {
  
  inline def apply(): Grant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
    
    inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
