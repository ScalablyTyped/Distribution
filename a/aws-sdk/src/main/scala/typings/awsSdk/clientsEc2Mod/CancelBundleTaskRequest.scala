package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBundleTaskRequest extends StObject {
  
  /**
    * The ID of the bundle task.
    */
  var BundleId: typings.awsSdk.clientsEc2Mod.BundleId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object CancelBundleTaskRequest {
  
  inline def apply(BundleId: BundleId): CancelBundleTaskRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBundleTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelBundleTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
