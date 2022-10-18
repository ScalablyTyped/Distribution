package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyBackupAttributesResponse extends StObject {
  
  var Backup: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Backup] = js.undefined
}
object ModifyBackupAttributesResponse {
  
  inline def apply(): ModifyBackupAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyBackupAttributesResponse]
  }
  
  extension [Self <: ModifyBackupAttributesResponse](x: Self) {
    
    inline def setBackup(value: Backup): Self = StObject.set(x, "Backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "Backup", js.undefined)
  }
}
