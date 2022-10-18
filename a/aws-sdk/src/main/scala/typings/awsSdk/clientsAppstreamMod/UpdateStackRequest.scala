package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackRequest extends StObject {
  
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ApplicationSettings] = js.undefined
  
  /**
    * The stack attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined
  
  /**
    * Deletes the storage connectors currently enabled for the stack.
    */
  var DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Description] = js.undefined
  
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsAppstreamMod.DisplayName] = js.undefined
  
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions. 
    */
  var EmbedHostDomains: js.UndefOr[typings.awsSdk.clientsAppstreamMod.EmbedHostDomains] = js.undefined
  
  /**
    * The URL that users are redirected to after they choose the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsSdk.clientsAppstreamMod.FeedbackURL] = js.undefined
  
  /**
    * The name of the stack.
    */
  var Name: String
  
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsSdk.clientsAppstreamMod.RedirectURL] = js.undefined
  
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  
  /**
    * The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
    */
  var StreamingExperienceSettings: js.UndefOr[typings.awsSdk.clientsAppstreamMod.StreamingExperienceSettings] = js.undefined
  
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
}
object UpdateStackRequest {
  
  inline def apply(Name: String): UpdateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackRequest]
  }
  
  extension [Self <: UpdateStackRequest](x: Self) {
    
    inline def setAccessEndpoints(value: AccessEndpointList): Self = StObject.set(x, "AccessEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAccessEndpointsUndefined: Self = StObject.set(x, "AccessEndpoints", js.undefined)
    
    inline def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = StObject.set(x, "AccessEndpoints", js.Array(value*))
    
    inline def setApplicationSettings(value: ApplicationSettings): Self = StObject.set(x, "ApplicationSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationSettingsUndefined: Self = StObject.set(x, "ApplicationSettings", js.undefined)
    
    inline def setAttributesToDelete(value: StackAttributes): Self = StObject.set(x, "AttributesToDelete", value.asInstanceOf[js.Any])
    
    inline def setAttributesToDeleteUndefined: Self = StObject.set(x, "AttributesToDelete", js.undefined)
    
    inline def setAttributesToDeleteVarargs(value: StackAttribute*): Self = StObject.set(x, "AttributesToDelete", js.Array(value*))
    
    inline def setDeleteStorageConnectors(value: Boolean): Self = StObject.set(x, "DeleteStorageConnectors", value.asInstanceOf[js.Any])
    
    inline def setDeleteStorageConnectorsUndefined: Self = StObject.set(x, "DeleteStorageConnectors", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmbedHostDomains(value: EmbedHostDomains): Self = StObject.set(x, "EmbedHostDomains", value.asInstanceOf[js.Any])
    
    inline def setEmbedHostDomainsUndefined: Self = StObject.set(x, "EmbedHostDomains", js.undefined)
    
    inline def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = StObject.set(x, "EmbedHostDomains", js.Array(value*))
    
    inline def setFeedbackURL(value: FeedbackURL): Self = StObject.set(x, "FeedbackURL", value.asInstanceOf[js.Any])
    
    inline def setFeedbackURLUndefined: Self = StObject.set(x, "FeedbackURL", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: RedirectURL): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    inline def setStorageConnectors(value: StorageConnectorList): Self = StObject.set(x, "StorageConnectors", value.asInstanceOf[js.Any])
    
    inline def setStorageConnectorsUndefined: Self = StObject.set(x, "StorageConnectors", js.undefined)
    
    inline def setStorageConnectorsVarargs(value: StorageConnector*): Self = StObject.set(x, "StorageConnectors", js.Array(value*))
    
    inline def setStreamingExperienceSettings(value: StreamingExperienceSettings): Self = StObject.set(x, "StreamingExperienceSettings", value.asInstanceOf[js.Any])
    
    inline def setStreamingExperienceSettingsUndefined: Self = StObject.set(x, "StreamingExperienceSettings", js.undefined)
    
    inline def setUserSettings(value: UserSettingList): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
    
    inline def setUserSettingsVarargs(value: UserSetting*): Self = StObject.set(x, "UserSettings", js.Array(value*))
  }
}
