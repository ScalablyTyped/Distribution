package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object ModifyClusterResult {
  
  inline def apply(): ModifyClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterResult]
  }
  
  extension [Self <: ModifyClusterResult](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
