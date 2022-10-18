package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchSnapshotConfiguration extends StObject {
  
  /**
    * The number of pre-provisioned snapshots to keep on hand for a fast-launch enabled Windows AMI.
    */
  var targetResourceCount: js.UndefOr[TargetResourceCount] = js.undefined
}
object FastLaunchSnapshotConfiguration {
  
  inline def apply(): FastLaunchSnapshotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastLaunchSnapshotConfiguration]
  }
  
  extension [Self <: FastLaunchSnapshotConfiguration](x: Self) {
    
    inline def setTargetResourceCount(value: TargetResourceCount): Self = StObject.set(x, "targetResourceCount", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceCountUndefined: Self = StObject.set(x, "targetResourceCount", js.undefined)
  }
}
