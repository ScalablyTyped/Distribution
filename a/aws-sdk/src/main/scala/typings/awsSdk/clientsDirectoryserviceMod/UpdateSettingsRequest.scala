package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSettingsRequest extends StObject {
  
  /**
    * The identifier of the directory for which to update settings.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The list of Setting objects.
    */
  var Settings: typings.awsSdk.clientsDirectoryserviceMod.Settings
}
object UpdateSettingsRequest {
  
  inline def apply(DirectoryId: DirectoryId, Settings: Settings): UpdateSettingsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSettingsRequest]
  }
  
  extension [Self <: UpdateSettingsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "Settings", js.Array(value*))
  }
}
