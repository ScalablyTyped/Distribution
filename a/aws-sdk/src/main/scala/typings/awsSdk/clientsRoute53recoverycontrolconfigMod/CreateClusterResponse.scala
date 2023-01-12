package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterResponse extends StObject {
  
  /**
    * The cluster that was created.
    */
  var Cluster: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.Cluster] = js.undefined
}
object CreateClusterResponse {
  
  inline def apply(): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
