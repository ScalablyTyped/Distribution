package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSnapshotCopyResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object EnableSnapshotCopyResult {
  
  inline def apply(): EnableSnapshotCopyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSnapshotCopyResult]
  }
  
  extension [Self <: EnableSnapshotCopyResult](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
