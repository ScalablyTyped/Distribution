package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyStatus extends StObject {
  
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[typings.awsSdk.clientsS3Mod.IsPublic] = js.undefined
}
object PolicyStatus {
  
  inline def apply(): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStatus]
  }
  
  extension [Self <: PolicyStatus](x: Self) {
    
    inline def setIsPublic(value: IsPublic): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "IsPublic", js.undefined)
  }
}
