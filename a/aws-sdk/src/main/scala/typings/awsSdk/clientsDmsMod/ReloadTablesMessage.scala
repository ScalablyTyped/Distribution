package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadTablesMessage extends StObject {
  
  /**
    * Options for reload. Specify data-reload to reload the data and re-validate it if validation is enabled. Specify validate-only to re-validate the table. This option applies only when validation is enabled for the task.  Valid values: data-reload, validate-only Default value is data-reload.
    */
  var ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String
  
  /**
    * The name and schema of the table to be reloaded. 
    */
  var TablesToReload: TableListToReload
}
object ReloadTablesMessage {
  
  inline def apply(ReplicationTaskArn: String, TablesToReload: TableListToReload): ReloadTablesMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], TablesToReload = TablesToReload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadTablesMessage]
  }
  
  extension [Self <: ReloadTablesMessage](x: Self) {
    
    inline def setReloadOption(value: ReloadOptionValue): Self = StObject.set(x, "ReloadOption", value.asInstanceOf[js.Any])
    
    inline def setReloadOptionUndefined: Self = StObject.set(x, "ReloadOption", js.undefined)
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setTablesToReload(value: TableListToReload): Self = StObject.set(x, "TablesToReload", value.asInstanceOf[js.Any])
    
    inline def setTablesToReloadVarargs(value: TableToReload*): Self = StObject.set(x, "TablesToReload", js.Array(value*))
  }
}
