package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySnapshotCopyRetentionPeriodResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object ModifySnapshotCopyRetentionPeriodResult {
  
  inline def apply(): ModifySnapshotCopyRetentionPeriodResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifySnapshotCopyRetentionPeriodResult] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
