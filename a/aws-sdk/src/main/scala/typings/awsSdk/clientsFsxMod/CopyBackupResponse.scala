package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBackupResponse extends StObject {
  
  var Backup: js.UndefOr[typings.awsSdk.clientsFsxMod.Backup] = js.undefined
}
object CopyBackupResponse {
  
  inline def apply(): CopyBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBackupResponse]
  }
  
  extension [Self <: CopyBackupResponse](x: Self) {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
