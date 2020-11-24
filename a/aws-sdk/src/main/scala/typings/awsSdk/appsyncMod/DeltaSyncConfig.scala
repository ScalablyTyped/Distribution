package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaSyncConfig extends js.Object {
  
  /**
    * The number of minutes an Item is stored in the datasource.
    */
  var baseTableTTL: js.UndefOr[Long] = js.native
  
  /**
    * The Delta Sync table name.
    */
  var deltaSyncTableName: js.UndefOr[String] = js.native
  
  /**
    * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
    */
  var deltaSyncTableTTL: js.UndefOr[Long] = js.native
}
object DeltaSyncConfig {
  
  @scala.inline
  def apply(): DeltaSyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaSyncConfig]
  }
  
  @scala.inline
  implicit class DeltaSyncConfigOps[Self <: DeltaSyncConfig] (val x: Self) extends AnyVal {
    
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
    def setBaseTableTTL(value: Long): Self = this.set("baseTableTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTableTTL: Self = this.set("baseTableTTL", js.undefined)
    
    @scala.inline
    def setDeltaSyncTableName(value: String): Self = this.set("deltaSyncTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaSyncTableName: Self = this.set("deltaSyncTableName", js.undefined)
    
    @scala.inline
    def setDeltaSyncTableTTL(value: Long): Self = this.set("deltaSyncTableTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaSyncTableTTL: Self = this.set("deltaSyncTableTTL", js.undefined)
  }
}
