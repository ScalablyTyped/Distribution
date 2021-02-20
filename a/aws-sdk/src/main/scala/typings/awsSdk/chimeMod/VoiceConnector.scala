package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceConnector extends StObject {
  
  /**
    * The AWS Region in which the Amazon Chime Voice Connector is created. Default: us-east-1.
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.native
  
  /**
    * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: js.UndefOr[VoiceConnectorName] = js.native
  
  /**
    * The outbound host name for the Amazon Chime Voice Connector.
    */
  var OutboundHostName: js.UndefOr[String] = js.native
  
  /**
    * Designates whether encryption is required for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: js.UndefOr[Boolean] = js.native
  
  /**
    * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.native
}
object VoiceConnector {
  
  @scala.inline
  def apply(): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnector]
  }
  
  @scala.inline
  implicit class VoiceConnectorMutableBuilder[Self <: VoiceConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: VoiceConnectorAwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutboundHostName(value: String): Self = StObject.set(x, "OutboundHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundHostNameUndefined: Self = StObject.set(x, "OutboundHostName", js.undefined)
    
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEncryptionUndefined: Self = StObject.set(x, "RequireEncryption", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorIdUndefined: Self = StObject.set(x, "VoiceConnectorId", js.undefined)
  }
}
