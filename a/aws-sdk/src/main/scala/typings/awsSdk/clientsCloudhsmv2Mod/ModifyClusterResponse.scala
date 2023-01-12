package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterResponse extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Cluster] = js.undefined
}
object ModifyClusterResponse {
  
  inline def apply(): ModifyClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
