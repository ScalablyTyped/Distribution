package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorRequest extends StObject {
  
  /**
    *  The AWS Region in which the Amazon Chime Voice Connector is created. Default value: us-east-1 . 
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined
  
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName
  
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean
}
object CreateVoiceConnectorRequest {
  
  inline def apply(Name: VoiceConnectorName, RequireEncryption: Boolean): CreateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorRequest]
  }
  
  extension [Self <: CreateVoiceConnectorRequest](x: Self) {
    
    inline def setAwsRegion(value: VoiceConnectorAwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
  }
}
