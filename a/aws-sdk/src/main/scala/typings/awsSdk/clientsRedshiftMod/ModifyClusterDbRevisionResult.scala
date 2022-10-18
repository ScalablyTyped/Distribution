package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterDbRevisionResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object ModifyClusterDbRevisionResult {
  
  inline def apply(): ModifyClusterDbRevisionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterDbRevisionResult]
  }
  
  extension [Self <: ModifyClusterDbRevisionResult](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
