package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMediaStorageConfigurationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the channel.
    */
  var ChannelARN: ResourceARN
  
  /**
    * A structure that encapsulates, or contains, the media storage configuration properties.
    */
  var MediaStorageConfiguration: typings.awsSdk.clientsKinesisvideoMod.MediaStorageConfiguration
}
object UpdateMediaStorageConfigurationInput {
  
  inline def apply(ChannelARN: ResourceARN, MediaStorageConfiguration: MediaStorageConfiguration): UpdateMediaStorageConfigurationInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], MediaStorageConfiguration = MediaStorageConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMediaStorageConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMediaStorageConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setMediaStorageConfiguration(value: MediaStorageConfiguration): Self = StObject.set(x, "MediaStorageConfiguration", value.asInstanceOf[js.Any])
  }
}
