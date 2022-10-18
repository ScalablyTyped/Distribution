package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSettingsResult extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}
object UpdateSettingsResult {
  
  inline def apply(): UpdateSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSettingsResult]
  }
  
  extension [Self <: UpdateSettingsResult](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
