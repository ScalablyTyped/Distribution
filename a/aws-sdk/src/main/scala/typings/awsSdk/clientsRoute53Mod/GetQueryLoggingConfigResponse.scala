package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryLoggingConfigResponse extends StObject {
  
  /**
    * A complex type that contains information about the query logging configuration that you specified in a GetQueryLoggingConfig request.
    */
  var QueryLoggingConfig: typings.awsSdk.clientsRoute53Mod.QueryLoggingConfig
}
object GetQueryLoggingConfigResponse {
  
  inline def apply(QueryLoggingConfig: QueryLoggingConfig): GetQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfig = QueryLoggingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryLoggingConfigResponse]
  }
  
  extension [Self <: GetQueryLoggingConfigResponse](x: Self) {
    
    inline def setQueryLoggingConfig(value: QueryLoggingConfig): Self = StObject.set(x, "QueryLoggingConfig", value.asInstanceOf[js.Any])
  }
}
