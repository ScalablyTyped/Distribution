package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverShardResponse extends StObject {
  
  /**
    * The cluster being failed over
    */
  var Cluster: js.UndefOr[typings.awsSdk.clientsMemorydbMod.Cluster] = js.undefined
}
object FailoverShardResponse {
  
  inline def apply(): FailoverShardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverShardResponse]
  }
  
  extension [Self <: FailoverShardResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
