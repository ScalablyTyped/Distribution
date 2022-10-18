package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreBackupResponse extends StObject {
  
  /**
    * Information on the Backup object created.
    */
  var Backup: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Backup] = js.undefined
}
object RestoreBackupResponse {
  
  inline def apply(): RestoreBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreBackupResponse]
  }
  
  extension [Self <: RestoreBackupResponse](x: Self) {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
