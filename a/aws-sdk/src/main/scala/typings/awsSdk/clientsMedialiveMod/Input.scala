package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * The Unique ARN of the input (generated, immutable).
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
    */
  var AttachedChannels: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the destinations of the input (PUSH-type).
    */
  var Destinations: js.UndefOr[listOfInputDestination] = js.undefined
  
  /**
    * The generated ID of the input (unique for user account, immutable).
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * STANDARD - MediaLive expects two sources to be connected to this input. If the channel is also STANDARD, both sources will be ingested. If the channel is SINGLE_PIPELINE, only the first source will be ingested; the second source will always be ignored, even if the first source fails.
  SINGLE_PIPELINE - You can connect only one source to this input. If the ChannelClass is also  SINGLE_PIPELINE, this value is valid. If the ChannelClass is STANDARD, this value is not valid because the channel requires two sources in the input.
    */
  var InputClass: js.UndefOr[typings.awsSdk.clientsMedialiveMod.InputClass] = js.undefined
  
  /**
    * Settings for the input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSettings] = js.undefined
  
  /**
    * A list of IDs for all Inputs which are partners of this one.
    */
  var InputPartnerIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Certain pull input sources can be dynamic, meaning that they can have their URL's dynamically changes
  during input switch actions. Presently, this functionality only works with MP4_FILE and TS_FILE inputs.
    */
  var InputSourceType: js.UndefOr[typings.awsSdk.clientsMedialiveMod.InputSourceType] = js.undefined
  
  /**
    * A list of MediaConnect Flows for this input.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlow] = js.undefined
  
  /**
    * The user-assigned name (This is a mutable value).
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * A list of IDs for all the Input Security Groups attached to the input.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the sources of the input (PULL-type).
    */
  var Sources: js.UndefOr[listOfInputSource] = js.undefined
  
  var State: js.UndefOr[InputState] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Tags] = js.undefined
  
  var Type: js.UndefOr[InputType] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttachedChannels(value: listOfString): Self = StObject.set(x, "AttachedChannels", value.asInstanceOf[js.Any])
    
    inline def setAttachedChannelsUndefined: Self = StObject.set(x, "AttachedChannels", js.undefined)
    
    inline def setAttachedChannelsVarargs(value: string*): Self = StObject.set(x, "AttachedChannels", js.Array(value*))
    
    inline def setDestinations(value: listOfInputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: InputDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInputClass(value: InputClass): Self = StObject.set(x, "InputClass", value.asInstanceOf[js.Any])
    
    inline def setInputClassUndefined: Self = StObject.set(x, "InputClass", js.undefined)
    
    inline def setInputDevices(value: listOfInputDeviceSettings): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    inline def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    inline def setInputDevicesVarargs(value: InputDeviceSettings*): Self = StObject.set(x, "InputDevices", js.Array(value*))
    
    inline def setInputPartnerIds(value: listOfString): Self = StObject.set(x, "InputPartnerIds", value.asInstanceOf[js.Any])
    
    inline def setInputPartnerIdsUndefined: Self = StObject.set(x, "InputPartnerIds", js.undefined)
    
    inline def setInputPartnerIdsVarargs(value: string*): Self = StObject.set(x, "InputPartnerIds", js.Array(value*))
    
    inline def setInputSourceType(value: InputSourceType): Self = StObject.set(x, "InputSourceType", value.asInstanceOf[js.Any])
    
    inline def setInputSourceTypeUndefined: Self = StObject.set(x, "InputSourceType", js.undefined)
    
    inline def setMediaConnectFlows(value: listOfMediaConnectFlow): Self = StObject.set(x, "MediaConnectFlows", value.asInstanceOf[js.Any])
    
    inline def setMediaConnectFlowsUndefined: Self = StObject.set(x, "MediaConnectFlows", js.undefined)
    
    inline def setMediaConnectFlowsVarargs(value: MediaConnectFlow*): Self = StObject.set(x, "MediaConnectFlows", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSources(value: listOfInputSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: InputSource*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setState(value: InputState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: InputType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
