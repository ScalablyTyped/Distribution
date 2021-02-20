package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseDataSourceConfig extends StObject {
  
  /**
    * Amazon RDS HTTP endpoint settings.
    */
  var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.native
  
  /**
    * Source type for the relational database.    RDS_HTTP_ENDPOINT: The relational database source type is an Amazon RDS HTTP endpoint.  
    */
  var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.native
}
object RelationalDatabaseDataSourceConfig {
  
  @scala.inline
  def apply(): RelationalDatabaseDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
  }
  
  @scala.inline
  implicit class RelationalDatabaseDataSourceConfigMutableBuilder[Self <: RelationalDatabaseDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRdsHttpEndpointConfig(value: RdsHttpEndpointConfig): Self = StObject.set(x, "rdsHttpEndpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsHttpEndpointConfigUndefined: Self = StObject.set(x, "rdsHttpEndpointConfig", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseSourceType(value: RelationalDatabaseSourceType): Self = StObject.set(x, "relationalDatabaseSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSourceTypeUndefined: Self = StObject.set(x, "relationalDatabaseSourceType", js.undefined)
  }
}
