package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDBInstanceAutomatedBackupsReplicationResult extends StObject {
  
  var DBInstanceAutomatedBackup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstanceAutomatedBackup] = js.undefined
}
object StartDBInstanceAutomatedBackupsReplicationResult {
  
  inline def apply(): StartDBInstanceAutomatedBackupsReplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDBInstanceAutomatedBackupsReplicationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDBInstanceAutomatedBackupsReplicationResult] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceAutomatedBackup(value: DBInstanceAutomatedBackup): Self = StObject.set(x, "DBInstanceAutomatedBackup", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackup", js.undefined)
  }
}
