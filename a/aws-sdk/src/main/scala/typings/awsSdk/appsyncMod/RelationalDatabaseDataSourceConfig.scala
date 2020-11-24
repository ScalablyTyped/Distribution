package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseDataSourceConfig extends js.Object {
  
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
  implicit class RelationalDatabaseDataSourceConfigOps[Self <: RelationalDatabaseDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRdsHttpEndpointConfig(value: RdsHttpEndpointConfig): Self = this.set("rdsHttpEndpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsHttpEndpointConfig: Self = this.set("rdsHttpEndpointConfig", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseSourceType(value: RelationalDatabaseSourceType): Self = this.set("relationalDatabaseSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationalDatabaseSourceType: Self = this.set("relationalDatabaseSourceType", js.undefined)
  }
}
