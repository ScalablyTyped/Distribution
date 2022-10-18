package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManagedPrefixListRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId
}
object DeleteManagedPrefixListRequest {
  
  inline def apply(PrefixListId: PrefixListResourceId): DeleteManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteManagedPrefixListRequest]
  }
  
  extension [Self <: DeleteManagedPrefixListRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
  }
}
