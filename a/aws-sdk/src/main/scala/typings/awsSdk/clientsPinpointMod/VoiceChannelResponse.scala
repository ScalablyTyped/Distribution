package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the voice channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when the voice channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the voice channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Deprecated) An identifier for the voice channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the voice channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.undefined
  
  /**
    * The user who last modified the voice channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when the voice channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The type of messaging or notification platform for the channel. For the voice channel, this value is VOICE.
    */
  var Platform: string
  
  /**
    * The current version of the voice channel.
    */
  var Version: js.UndefOr[integer] = js.undefined
}
object VoiceChannelResponse {
  
  inline def apply(Platform: string): VoiceChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceChannelResponse]
  }
  
  extension [Self <: VoiceChannelResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setHasCredential(value: boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
    
    inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIsArchived(value: boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
    
    inline def setLastModifiedBy(value: string): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
