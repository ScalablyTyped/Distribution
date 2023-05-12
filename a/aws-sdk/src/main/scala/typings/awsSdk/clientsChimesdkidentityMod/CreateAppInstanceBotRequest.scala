package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceBotRequest extends StObject {
  
  /**
    * The ARN of the AppInstance request.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The unique ID for the client making the request. Use different tokens for different AppInstanceBots.
    */
  var ClientRequestToken: typings.awsSdk.clientsChimesdkidentityMod.ClientRequestToken
  
  /**
    * Configuration information about the Amazon Lex V2 V2 bot.
    */
  var Configuration: typings.awsSdk.clientsChimesdkidentityMod.Configuration
  
  /**
    * The request metadata. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.Metadata] = js.undefined
  
  /**
    * The user's name.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The tags assigned to the AppInstanceBot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAppInstanceBotRequest {
  
  inline def apply(AppInstanceArn: ChimeArn, ClientRequestToken: ClientRequestToken, Configuration: Configuration): CreateAppInstanceBotRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppInstanceBotRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
