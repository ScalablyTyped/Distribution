package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumeRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * Specifies the name of the volume that you're creating.
    */
  var Name: VolumeName
  
  /**
    * Specifies the configuration to use when creating the ONTAP volume.
    */
  var OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration] = js.undefined
  
  /**
    * Specifies the configuration to use when creating the OpenZFS volume.
    */
  var OpenZFSConfiguration: js.UndefOr[CreateOpenZFSVolumeConfiguration] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsFsxMod.Tags] = js.undefined
  
  /**
    * Specifies the type of volume to create; ONTAP and OPENZFS are the only valid volume types.
    */
  var VolumeType: typings.awsSdk.clientsFsxMod.VolumeType
}
object CreateVolumeRequest {
  
  inline def apply(Name: VolumeName, VolumeType: VolumeType): CreateVolumeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VolumeType = VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumeRequest]
  }
  
  extension [Self <: CreateVolumeRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: VolumeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOntapConfiguration(value: CreateOntapVolumeConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: CreateOpenZFSVolumeConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
  }
}
