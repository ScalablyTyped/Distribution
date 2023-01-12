package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumeFromBackupResponse extends StObject {
  
  /**
    * Returned after a successful CreateVolumeFromBackup API operation, describing the volume just created.
    */
  var Volume: js.UndefOr[typings.awsSdk.clientsFsxMod.Volume] = js.undefined
}
object CreateVolumeFromBackupResponse {
  
  inline def apply(): CreateVolumeFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumeFromBackupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVolumeFromBackupResponse] (val x: Self) extends AnyVal {
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
