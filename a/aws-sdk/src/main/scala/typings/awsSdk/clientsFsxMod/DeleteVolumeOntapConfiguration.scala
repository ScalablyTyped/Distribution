package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeOntapConfiguration extends StObject {
  
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Set to true if you want to skip taking a final backup of the volume you are deleting.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.undefined
}
object DeleteVolumeOntapConfiguration {
  
  inline def apply(): DeleteVolumeOntapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVolumeOntapConfiguration]
  }
  
  extension [Self <: DeleteVolumeOntapConfiguration](x: Self) {
    
    inline def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    inline def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value*))
    
    inline def setSkipFinalBackup(value: Flag): Self = StObject.set(x, "SkipFinalBackup", value.asInstanceOf[js.Any])
    
    inline def setSkipFinalBackupUndefined: Self = StObject.set(x, "SkipFinalBackup", js.undefined)
  }
}
