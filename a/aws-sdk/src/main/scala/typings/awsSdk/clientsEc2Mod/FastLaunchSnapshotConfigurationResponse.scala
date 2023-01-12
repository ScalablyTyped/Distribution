package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchSnapshotConfigurationResponse extends StObject {
  
  /**
    * The number of pre-provisioned snapshots requested to keep on hand for a fast-launch enabled Windows AMI.
    */
  var TargetResourceCount: js.UndefOr[Integer] = js.undefined
}
object FastLaunchSnapshotConfigurationResponse {
  
  inline def apply(): FastLaunchSnapshotConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastLaunchSnapshotConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastLaunchSnapshotConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setTargetResourceCount(value: Integer): Self = StObject.set(x, "TargetResourceCount", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceCountUndefined: Self = StObject.set(x, "TargetResourceCount", js.undefined)
  }
}
