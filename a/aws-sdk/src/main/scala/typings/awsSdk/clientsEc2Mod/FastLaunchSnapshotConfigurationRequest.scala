package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchSnapshotConfigurationRequest extends StObject {
  
  /**
    * The number of pre-provisioned snapshots to keep on hand for a fast-launch enabled Windows AMI.
    */
  var TargetResourceCount: js.UndefOr[Integer] = js.undefined
}
object FastLaunchSnapshotConfigurationRequest {
  
  inline def apply(): FastLaunchSnapshotConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastLaunchSnapshotConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastLaunchSnapshotConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setTargetResourceCount(value: Integer): Self = StObject.set(x, "TargetResourceCount", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceCountUndefined: Self = StObject.set(x, "TargetResourceCount", js.undefined)
  }
}
