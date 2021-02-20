package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStackRequest extends StObject {
  
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsSdk.appstreamMod.ApplicationSettings] = js.native
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.native
  
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.native
  
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions. 
    */
  var EmbedHostDomains: js.UndefOr[typings.awsSdk.appstreamMod.EmbedHostDomains] = js.native
  
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsSdk.appstreamMod.FeedbackURL] = js.native
  
  /**
    * The name of the stack.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsSdk.appstreamMod.RedirectURL] = js.native
  
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  
  /**
    * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.appstreamMod.Tags] = js.native
  
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}
object CreateStackRequest {
  
  @scala.inline
  def apply(Name: Name): CreateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackRequest]
  }
  
  @scala.inline
  implicit class CreateStackRequestMutableBuilder[Self <: CreateStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessEndpoints(value: AccessEndpointList): Self = StObject.set(x, "AccessEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessEndpointsUndefined: Self = StObject.set(x, "AccessEndpoints", js.undefined)
    
    @scala.inline
    def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = StObject.set(x, "AccessEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setApplicationSettings(value: ApplicationSettings): Self = StObject.set(x, "ApplicationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSettingsUndefined: Self = StObject.set(x, "ApplicationSettings", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEmbedHostDomains(value: EmbedHostDomains): Self = StObject.set(x, "EmbedHostDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHostDomainsUndefined: Self = StObject.set(x, "EmbedHostDomains", js.undefined)
    
    @scala.inline
    def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = StObject.set(x, "EmbedHostDomains", js.Array(value :_*))
    
    @scala.inline
    def setFeedbackURL(value: FeedbackURL): Self = StObject.set(x, "FeedbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackURLUndefined: Self = StObject.set(x, "FeedbackURL", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: RedirectURL): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    @scala.inline
    def setStorageConnectors(value: StorageConnectorList): Self = StObject.set(x, "StorageConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConnectorsUndefined: Self = StObject.set(x, "StorageConnectors", js.undefined)
    
    @scala.inline
    def setStorageConnectorsVarargs(value: StorageConnector*): Self = StObject.set(x, "StorageConnectors", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUserSettings(value: UserSettingList): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
    
    @scala.inline
    def setUserSettingsVarargs(value: UserSetting*): Self = StObject.set(x, "UserSettings", js.Array(value :_*))
  }
}
