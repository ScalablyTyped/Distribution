package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacePermissionAssociationsResponse extends StObject {
  
  /**
    * The idempotency identifier associated with this request. If you want to repeat the same operation in an idempotent manner then you must include this value in the clientToken request parameter of that later call. All other parameters must also have the same values that you used in the first call.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete this operation. You can use the ListReplacePermissionAssociationsWork operation and pass the id value returned in this structure.
    */
  var replacePermissionAssociationsWork: js.UndefOr[ReplacePermissionAssociationsWork] = js.undefined
}
object ReplacePermissionAssociationsResponse {
  
  inline def apply(): ReplacePermissionAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacePermissionAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplacePermissionAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setReplacePermissionAssociationsWork(value: ReplacePermissionAssociationsWork): Self = StObject.set(x, "replacePermissionAssociationsWork", value.asInstanceOf[js.Any])
    
    inline def setReplacePermissionAssociationsWorkUndefined: Self = StObject.set(x, "replacePermissionAssociationsWork", js.undefined)
  }
}
