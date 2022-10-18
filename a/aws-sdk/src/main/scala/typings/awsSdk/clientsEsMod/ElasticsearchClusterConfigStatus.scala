package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchClusterConfigStatus extends StObject {
  
  /**
    *  Specifies the cluster configuration for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchClusterConfig
  
  /**
    *  Specifies the status of the configuration for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}
object ElasticsearchClusterConfigStatus {
  
  inline def apply(Options: ElasticsearchClusterConfig, Status: OptionStatus): ElasticsearchClusterConfigStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchClusterConfigStatus]
  }
  
  extension [Self <: ElasticsearchClusterConfigStatus](x: Self) {
    
    inline def setOptions(value: ElasticsearchClusterConfig): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
