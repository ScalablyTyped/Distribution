package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputRequest extends StObject {
  
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.undefined
  
  /**
    * Settings for the devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSettings] = js.undefined
  
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.undefined
  
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Unique identifier of the request to ensure the request is handled
  exactly once in case of retries.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[listOfInputSourceRequest] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Tags] = js.undefined
  
  var Type: js.UndefOr[InputType] = js.undefined
  
  var Vpc: js.UndefOr[InputVpcRequest] = js.undefined
}
object CreateInputRequest {
  
  inline def apply(): CreateInputRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInputRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinations(value: listOfInputDestinationRequest): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: InputDestinationRequest*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setInputDevices(value: listOfInputDeviceSettings): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    inline def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    inline def setInputDevicesVarargs(value: InputDeviceSettings*): Self = StObject.set(x, "InputDevices", js.Array(value*))
    
    inline def setInputSecurityGroups(value: listOfString): Self = StObject.set(x, "InputSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setInputSecurityGroupsUndefined: Self = StObject.set(x, "InputSecurityGroups", js.undefined)
    
    inline def setInputSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "InputSecurityGroups", js.Array(value*))
    
    inline def setMediaConnectFlows(value: listOfMediaConnectFlowRequest): Self = StObject.set(x, "MediaConnectFlows", value.asInstanceOf[js.Any])
    
    inline def setMediaConnectFlowsUndefined: Self = StObject.set(x, "MediaConnectFlows", js.undefined)
    
    inline def setMediaConnectFlowsVarargs(value: MediaConnectFlowRequest*): Self = StObject.set(x, "MediaConnectFlows", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSources(value: listOfInputSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: InputSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: InputType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVpc(value: InputVpcRequest): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
