package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupResponse extends StObject {
  
  /**
    * Backup created by request.
    */
  var Backup: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.Backup] = js.undefined
}
object CreateBackupResponse {
  
  inline def apply(): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackupResponse] (val x: Self) extends AnyVal {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
