package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceAutomatedBackupMessage extends StObject {
  
  /**
    * A list of DBInstanceAutomatedBackup instances.
    */
  var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBInstanceAutomatedBackupMessage {
  
  inline def apply(): DBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBInstanceAutomatedBackupMessage] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceAutomatedBackups(value: DBInstanceAutomatedBackupList): Self = StObject.set(x, "DBInstanceAutomatedBackups", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackups", js.undefined)
    
    inline def setDBInstanceAutomatedBackupsVarargs(value: DBInstanceAutomatedBackup*): Self = StObject.set(x, "DBInstanceAutomatedBackups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
