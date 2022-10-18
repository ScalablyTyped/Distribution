package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGrant extends StObject {
  
  /**
    * Container for the person being granted permissions.
    */
  var Grantee: js.UndefOr[typings.awsSdk.clientsS3Mod.Grantee] = js.undefined
  
  /**
    * Logging permissions assigned to the grantee for the bucket.
    */
  var Permission: js.UndefOr[BucketLogsPermission] = js.undefined
}
object TargetGrant {
  
  inline def apply(): TargetGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGrant]
  }
  
  extension [Self <: TargetGrant](x: Self) {
    
    inline def setGrantee(value: Grantee): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setPermission(value: BucketLogsPermission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
