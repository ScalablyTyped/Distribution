package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnector extends StObject {
  
  /**
    *  The AWS Region in which the Amazon Chime Voice Connector is created. Default: us-east-1. 
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: js.UndefOr[VoiceConnectorName] = js.undefined
  
  /**
    * The outbound host name for the Amazon Chime Voice Connector.
    */
  var OutboundHostName: js.UndefOr[String] = js.undefined
  
  /**
    * Designates whether encryption is required for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the specified Amazon Chime Voice Connector.
    */
  var VoiceConnectorArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
}
object VoiceConnector {
  
  inline def apply(): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnector]
  }
  
  extension [Self <: VoiceConnector](x: Self) {
    
    inline def setAwsRegion(value: VoiceConnectorAwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutboundHostName(value: String): Self = StObject.set(x, "OutboundHostName", value.asInstanceOf[js.Any])
    
    inline def setOutboundHostNameUndefined: Self = StObject.set(x, "OutboundHostName", js.undefined)
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryptionUndefined: Self = StObject.set(x, "RequireEncryption", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceConnectorArn(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorArn", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorArnUndefined: Self = StObject.set(x, "VoiceConnectorArn", js.undefined)
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorIdUndefined: Self = StObject.set(x, "VoiceConnectorId", js.undefined)
  }
}
