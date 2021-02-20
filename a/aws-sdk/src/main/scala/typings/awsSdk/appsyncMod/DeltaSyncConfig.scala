package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaSyncConfig extends StObject {
  
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
  implicit class DeltaSyncConfigMutableBuilder[Self <: DeltaSyncConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseTableTTL(value: Long): Self = StObject.set(x, "baseTableTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTableTTLUndefined: Self = StObject.set(x, "baseTableTTL", js.undefined)
    
    @scala.inline
    def setDeltaSyncTableName(value: String): Self = StObject.set(x, "deltaSyncTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaSyncTableNameUndefined: Self = StObject.set(x, "deltaSyncTableName", js.undefined)
    
    @scala.inline
    def setDeltaSyncTableTTL(value: Long): Self = StObject.set(x, "deltaSyncTableTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaSyncTableTTLUndefined: Self = StObject.set(x, "deltaSyncTableTTL", js.undefined)
  }
}
