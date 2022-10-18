package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseReplicationFactorResponse extends StObject {
  
  /**
    * A description of the DAX cluster, after you have decreased its replication factor.
    */
  var Cluster: js.UndefOr[typings.awsSdk.clientsDaxMod.Cluster] = js.undefined
}
object DecreaseReplicationFactorResponse {
  
  inline def apply(): DecreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseReplicationFactorResponse]
  }
  
  extension [Self <: DecreaseReplicationFactorResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
