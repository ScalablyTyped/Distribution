package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined
  
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.undefined
  
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address that the flow will be listening on for incoming content.
    */
  var IngestIp: js.UndefOr[string] = js.undefined
  
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The media streams that are associated with the source, and the parameters for those associations.
    */
  var MediaStreamSourceConfigurations: js.UndefOr[listOfMediaStreamSourceConfiguration] = js.undefined
  
  /**
    * The name of the source.
    */
  var Name: string
  
  /**
    * The port that the flow uses to send outbound requests to initiate connection with the sender.
    */
  var SenderControlPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The IP address that the flow communicates with to initiate connection with the sender.
    */
  var SenderIpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the source.
    */
  var SourceArn: string
  
  /**
    * Attributes related to the transport stream that are used in the source.
    */
  var Transport: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Transport] = js.undefined
  
  /**
    * The name of the VPC interface that is used for this source.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
  
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.undefined
}
object Source {
  
  inline def apply(Name: string, SourceArn: string): Source = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    inline def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    inline def setDecryption(value: Encryption): Self = StObject.set(x, "Decryption", value.asInstanceOf[js.Any])
    
    inline def setDecryptionUndefined: Self = StObject.set(x, "Decryption", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    inline def setIngestIp(value: string): Self = StObject.set(x, "IngestIp", value.asInstanceOf[js.Any])
    
    inline def setIngestIpUndefined: Self = StObject.set(x, "IngestIp", js.undefined)
    
    inline def setIngestPort(value: integer): Self = StObject.set(x, "IngestPort", value.asInstanceOf[js.Any])
    
    inline def setIngestPortUndefined: Self = StObject.set(x, "IngestPort", js.undefined)
    
    inline def setMediaStreamSourceConfigurations(value: listOfMediaStreamSourceConfiguration): Self = StObject.set(x, "MediaStreamSourceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamSourceConfigurationsUndefined: Self = StObject.set(x, "MediaStreamSourceConfigurations", js.undefined)
    
    inline def setMediaStreamSourceConfigurationsVarargs(value: MediaStreamSourceConfiguration*): Self = StObject.set(x, "MediaStreamSourceConfigurations", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPort(value: integer): Self = StObject.set(x, "SenderControlPort", value.asInstanceOf[js.Any])
    
    inline def setSenderControlPortUndefined: Self = StObject.set(x, "SenderControlPort", js.undefined)
    
    inline def setSenderIpAddress(value: string): Self = StObject.set(x, "SenderIpAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderIpAddressUndefined: Self = StObject.set(x, "SenderIpAddress", js.undefined)
    
    inline def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
    
    inline def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
    
    inline def setWhitelistCidr(value: string): Self = StObject.set(x, "WhitelistCidr", value.asInstanceOf[js.Any])
    
    inline def setWhitelistCidrUndefined: Self = StObject.set(x, "WhitelistCidr", js.undefined)
  }
}
