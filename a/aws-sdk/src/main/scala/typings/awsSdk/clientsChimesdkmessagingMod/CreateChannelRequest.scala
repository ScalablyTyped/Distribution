package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * The ARN of the channel request.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The ID of the channel in the request.
    */
  var ChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ChannelId] = js.undefined
  
  /**
    * The ARN of the AppInstanceUser or AppInstanceBot that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The client token for the request. An Idempotency token.
    */
  var ClientRequestToken: typings.awsSdk.clientsChimesdkmessagingMod.ClientRequestToken
  
  /**
    * The attributes required to configure and create an elastic channel. An elastic channel can support a maximum of 1-million users, excluding moderators.
    */
  var ElasticChannelConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ElasticChannelConfiguration] = js.undefined
  
  /**
    * Settings that control the interval after which the channel is automatically deleted.
    */
  var ExpirationSettings: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ExpirationSettings] = js.undefined
  
  /**
    * The ARNs of the channel members in the request.
    */
  var MemberArns: js.UndefOr[ChannelMemberArns] = js.undefined
  
  /**
    * The metadata of the creation request. Limited to 1KB and UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * The channel mode: UNRESTRICTED or RESTRICTED. Administrators, moderators, and channel members can add themselves and other members to unrestricted channels. Only administrators and moderators can add members to restricted channels.
    */
  var Mode: js.UndefOr[ChannelMode] = js.undefined
  
  /**
    * The ARNs of the channel moderators in the request.
    */
  var ModeratorArns: js.UndefOr[ChannelModeratorArns] = js.undefined
  
  /**
    * The name of the channel.
    */
  var Name: NonEmptyResourceName
  
  /**
    * The channel's privacy level: PUBLIC or PRIVATE. Private channels aren't discoverable by users outside the channel. Public channels are discoverable by anyone in the AppInstance.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
  
  /**
    * The tags for the creation request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(
    AppInstanceArn: ChimeArn,
    ChimeBearer: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Name: NonEmptyResourceName
  ): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setChannelId(value: ChannelId): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setElasticChannelConfiguration(value: ElasticChannelConfiguration): Self = StObject.set(x, "ElasticChannelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setElasticChannelConfigurationUndefined: Self = StObject.set(x, "ElasticChannelConfiguration", js.undefined)
    
    inline def setExpirationSettings(value: ExpirationSettings): Self = StObject.set(x, "ExpirationSettings", value.asInstanceOf[js.Any])
    
    inline def setExpirationSettingsUndefined: Self = StObject.set(x, "ExpirationSettings", js.undefined)
    
    inline def setMemberArns(value: ChannelMemberArns): Self = StObject.set(x, "MemberArns", value.asInstanceOf[js.Any])
    
    inline def setMemberArnsUndefined: Self = StObject.set(x, "MemberArns", js.undefined)
    
    inline def setMemberArnsVarargs(value: ChimeArn*): Self = StObject.set(x, "MemberArns", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setModeratorArns(value: ChannelModeratorArns): Self = StObject.set(x, "ModeratorArns", value.asInstanceOf[js.Any])
    
    inline def setModeratorArnsUndefined: Self = StObject.set(x, "ModeratorArns", js.undefined)
    
    inline def setModeratorArnsVarargs(value: ChimeArn*): Self = StObject.set(x, "ModeratorArns", js.Array(value*))
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: ChannelPrivacy): Self = StObject.set(x, "Privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "Privacy", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
