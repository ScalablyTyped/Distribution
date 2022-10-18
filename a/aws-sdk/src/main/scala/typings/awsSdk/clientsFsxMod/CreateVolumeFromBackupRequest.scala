package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumeFromBackupRequest extends StObject {
  
  var BackupId: typings.awsSdk.clientsFsxMod.BackupId
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the new volume you're creating.
    */
  var Name: VolumeName
  
  /**
    * Specifies the configuration of the ONTAP volume that you are creating.
    */
  var OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
}
object CreateVolumeFromBackupRequest {
  
  inline def apply(BackupId: BackupId, Name: VolumeName): CreateVolumeFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumeFromBackupRequest]
  }
  
  extension [Self <: CreateVolumeFromBackupRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: VolumeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOntapConfiguration(value: CreateOntapVolumeConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
