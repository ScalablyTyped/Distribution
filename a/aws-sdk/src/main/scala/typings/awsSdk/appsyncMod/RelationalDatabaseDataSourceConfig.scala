package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseDataSourceConfig extends StObject {
  
  /**
    * Amazon RDS HTTP endpoint settings.
    */
  var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined
  
  /**
    * Source type for the relational database.    RDS_HTTP_ENDPOINT: The relational database source type is an Amazon Relational Database Service (Amazon RDS) HTTP endpoint.  
    */
  var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined
}
object RelationalDatabaseDataSourceConfig {
  
  inline def apply(): RelationalDatabaseDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
  }
  
  extension [Self <: RelationalDatabaseDataSourceConfig](x: Self) {
    
    inline def setRdsHttpEndpointConfig(value: RdsHttpEndpointConfig): Self = StObject.set(x, "rdsHttpEndpointConfig", value.asInstanceOf[js.Any])
    
    inline def setRdsHttpEndpointConfigUndefined: Self = StObject.set(x, "rdsHttpEndpointConfig", js.undefined)
    
    inline def setRelationalDatabaseSourceType(value: RelationalDatabaseSourceType): Self = StObject.set(x, "relationalDatabaseSourceType", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseSourceTypeUndefined: Self = StObject.set(x, "relationalDatabaseSourceType", js.undefined)
  }
}
