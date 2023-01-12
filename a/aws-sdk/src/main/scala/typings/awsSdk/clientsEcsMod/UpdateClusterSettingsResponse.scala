package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterSettingsResponse extends StObject {
  
  /**
    * Details about the cluster
    */
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object UpdateClusterSettingsResponse {
  
  inline def apply(): UpdateClusterSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
