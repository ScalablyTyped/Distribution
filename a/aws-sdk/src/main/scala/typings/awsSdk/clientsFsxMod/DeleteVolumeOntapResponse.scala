package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeOntapResponse extends StObject {
  
  var FinalBackupId: js.UndefOr[BackupId] = js.undefined
  
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
}
object DeleteVolumeOntapResponse {
  
  inline def apply(): DeleteVolumeOntapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVolumeOntapResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVolumeOntapResponse] (val x: Self) extends AnyVal {
    
    inline def setFinalBackupId(value: BackupId): Self = StObject.set(x, "FinalBackupId", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupIdUndefined: Self = StObject.set(x, "FinalBackupId", js.undefined)
    
    inline def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    inline def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value*))
  }
}
