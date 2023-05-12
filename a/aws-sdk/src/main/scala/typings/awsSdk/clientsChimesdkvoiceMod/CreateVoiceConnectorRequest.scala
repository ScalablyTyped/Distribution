package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceConnectorRequest extends StObject {
  
  /**
    * The AWS Region in which the Amazon Chime SDK Voice Connector is created. Default value: us-east-1 .
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined
  
  /**
    * The name of the Voice Connector.
    */
  var Name: VoiceConnectorName
  
  /**
    * Enables or disables encryption for the Voice Connector.
    */
  var RequireEncryption: Boolean
  
  /**
    * The tags assigned to the Voice Connector.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateVoiceConnectorRequest {
  
  inline def apply(Name: VoiceConnectorName, RequireEncryption: Boolean): CreateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsRegion(value: VoiceConnectorAwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setName(value: VoiceConnectorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "RequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
