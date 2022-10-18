package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceAutomatedBackupResult extends StObject {
  
  var DBInstanceAutomatedBackup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstanceAutomatedBackup] = js.undefined
}
object DeleteDBInstanceAutomatedBackupResult {
  
  inline def apply(): DeleteDBInstanceAutomatedBackupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
  }
  
  extension [Self <: DeleteDBInstanceAutomatedBackupResult](x: Self) {
    
    inline def setDBInstanceAutomatedBackup(value: DBInstanceAutomatedBackup): Self = StObject.set(x, "DBInstanceAutomatedBackup", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackup", js.undefined)
  }
}
