package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * Specification of CDI inputs for this channel
    */
  var CdiInputSpecification: js.UndefOr[typings.awsSdk.clientsMedialiveMod.CdiInputSpecification] = js.undefined
  
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ChannelClass] = js.undefined
  
  var Destinations: js.UndefOr[listOfOutputDestination] = js.undefined
  
  var EncoderSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.EncoderSettings] = js.undefined
  
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.undefined
  
  /**
    * Specification of network and file inputs for this channel
    */
  var InputSpecification: js.UndefOr[typings.awsSdk.clientsMedialiveMod.InputSpecification] = js.undefined
  
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.clientsMedialiveMod.LogLevel] = js.undefined
  
  /**
    * Maintenance settings for this channel.
    */
  var Maintenance: js.UndefOr[MaintenanceCreateSettings] = js.undefined
  
  /**
    * Name of channel.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Unique request ID to be specified. This is needed to prevent retries from
  creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * Deprecated field that's only usable by whitelisted customers.
    */
  var Reserved: js.UndefOr[string] = js.undefined
  
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Tags] = js.undefined
  
  /**
    * Settings for the VPC outputs
    */
  var Vpc: js.UndefOr[VpcOutputSettings] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setCdiInputSpecification(value: CdiInputSpecification): Self = StObject.set(x, "CdiInputSpecification", value.asInstanceOf[js.Any])
    
    inline def setCdiInputSpecificationUndefined: Self = StObject.set(x, "CdiInputSpecification", js.undefined)
    
    inline def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    inline def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    inline def setDestinations(value: listOfOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: OutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setEncoderSettings(value: EncoderSettings): Self = StObject.set(x, "EncoderSettings", value.asInstanceOf[js.Any])
    
    inline def setEncoderSettingsUndefined: Self = StObject.set(x, "EncoderSettings", js.undefined)
    
    inline def setInputAttachments(value: listOfInputAttachment): Self = StObject.set(x, "InputAttachments", value.asInstanceOf[js.Any])
    
    inline def setInputAttachmentsUndefined: Self = StObject.set(x, "InputAttachments", js.undefined)
    
    inline def setInputAttachmentsVarargs(value: InputAttachment*): Self = StObject.set(x, "InputAttachments", js.Array(value*))
    
    inline def setInputSpecification(value: InputSpecification): Self = StObject.set(x, "InputSpecification", value.asInstanceOf[js.Any])
    
    inline def setInputSpecificationUndefined: Self = StObject.set(x, "InputSpecification", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setMaintenance(value: MaintenanceCreateSettings): Self = StObject.set(x, "Maintenance", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceUndefined: Self = StObject.set(x, "Maintenance", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setReserved(value: string): Self = StObject.set(x, "Reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "Reserved", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpc(value: VpcOutputSettings): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
