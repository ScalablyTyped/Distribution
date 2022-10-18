package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupResponse extends StObject {
  
  /**
    * Information on the Backup object deleted.
    */
  var Backup: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Backup] = js.undefined
}
object DeleteBackupResponse {
  
  inline def apply(): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupResponse]
  }
  
  extension [Self <: DeleteBackupResponse](x: Self) {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
