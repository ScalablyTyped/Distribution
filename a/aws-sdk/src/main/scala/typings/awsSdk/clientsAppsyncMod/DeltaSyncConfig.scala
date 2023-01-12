package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaSyncConfig extends StObject {
  
  /**
    * The number of minutes that an Item is stored in the data source.
    */
  var baseTableTTL: js.UndefOr[Long] = js.undefined
  
  /**
    * The Delta Sync table name.
    */
  var deltaSyncTableName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of minutes that a Delta Sync log entry is stored in the Delta Sync table.
    */
  var deltaSyncTableTTL: js.UndefOr[Long] = js.undefined
}
object DeltaSyncConfig {
  
  inline def apply(): DeltaSyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaSyncConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeltaSyncConfig] (val x: Self) extends AnyVal {
    
    inline def setBaseTableTTL(value: Long): Self = StObject.set(x, "baseTableTTL", value.asInstanceOf[js.Any])
    
    inline def setBaseTableTTLUndefined: Self = StObject.set(x, "baseTableTTL", js.undefined)
    
    inline def setDeltaSyncTableName(value: String): Self = StObject.set(x, "deltaSyncTableName", value.asInstanceOf[js.Any])
    
    inline def setDeltaSyncTableNameUndefined: Self = StObject.set(x, "deltaSyncTableName", js.undefined)
    
    inline def setDeltaSyncTableTTL(value: Long): Self = StObject.set(x, "deltaSyncTableTTL", value.asInstanceOf[js.Any])
    
    inline def setDeltaSyncTableTTLUndefined: Self = StObject.set(x, "deltaSyncTableTTL", js.undefined)
  }
}
