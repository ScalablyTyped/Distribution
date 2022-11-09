package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfigStatus extends StObject {
  
  /**
    * Cluster configuration options for the specified domain.
    */
  var Options: ClusterConfig
  
  /**
    * The status of cluster configuration options for the specified domain.
    */
  var Status: OptionStatus
}
object ClusterConfigStatus {
  
  inline def apply(Options: ClusterConfig, Status: OptionStatus): ClusterConfigStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterConfigStatus]
  }
  
  extension [Self <: ClusterConfigStatus](x: Self) {
    
    inline def setOptions(value: ClusterConfig): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
