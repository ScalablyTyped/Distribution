package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSignalingChannelInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to update.
    */
  var ChannelARN: ResourceARN
  
  /**
    * The current version of the signaling channel that you want to update.
    */
  var CurrentVersion: Version
  
  /**
    * The structure containing the configuration for the SINGLE_MASTER type of the signaling channel that you want to update. 
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.SingleMasterConfiguration] = js.undefined
}
object UpdateSignalingChannelInput {
  
  inline def apply(ChannelARN: ResourceARN, CurrentVersion: Version): UpdateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalingChannelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSignalingChannelInput] (val x: Self) extends AnyVal {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
  }
}
