package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints. 
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  
  /**
    * The persistent application settings for users of the stack.
    */
  var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined
  
  /**
    * The ARN of the stack.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.undefined
  
  /**
    * The time the stack was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
    */
  var EmbedHostDomains: js.UndefOr[typings.awsSdk.appstreamMod.EmbedHostDomains] = js.undefined
  
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsSdk.appstreamMod.FeedbackURL] = js.undefined
  
  /**
    * The name of the stack.
    */
  var Name: String
  
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsSdk.appstreamMod.RedirectURL] = js.undefined
  
  /**
    * The errors for the stack.
    */
  var StackErrors: js.UndefOr[typings.awsSdk.appstreamMod.StackErrors] = js.undefined
  
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  
  /**
    * The streaming protocol you want your stack to prefer. This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
    */
  var StreamingExperienceSettings: js.UndefOr[typings.awsSdk.appstreamMod.StreamingExperienceSettings] = js.undefined
  
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
}
object Stack {
  
  inline def apply(Name: String): Stack = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  
  extension [Self <: Stack](x: Self) {
    
    inline def setAccessEndpoints(value: AccessEndpointList): Self = StObject.set(x, "AccessEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAccessEndpointsUndefined: Self = StObject.set(x, "AccessEndpoints", js.undefined)
    
    inline def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = StObject.set(x, "AccessEndpoints", js.Array(value*))
    
    inline def setApplicationSettings(value: ApplicationSettingsResponse): Self = StObject.set(x, "ApplicationSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationSettingsUndefined: Self = StObject.set(x, "ApplicationSettings", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmbedHostDomains(value: EmbedHostDomains): Self = StObject.set(x, "EmbedHostDomains", value.asInstanceOf[js.Any])
    
    inline def setEmbedHostDomainsUndefined: Self = StObject.set(x, "EmbedHostDomains", js.undefined)
    
    inline def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = StObject.set(x, "EmbedHostDomains", js.Array(value*))
    
    inline def setFeedbackURL(value: FeedbackURL): Self = StObject.set(x, "FeedbackURL", value.asInstanceOf[js.Any])
    
    inline def setFeedbackURLUndefined: Self = StObject.set(x, "FeedbackURL", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: RedirectURL): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "RedirectURL", js.undefined)
    
    inline def setStackErrors(value: StackErrors): Self = StObject.set(x, "StackErrors", value.asInstanceOf[js.Any])
    
    inline def setStackErrorsUndefined: Self = StObject.set(x, "StackErrors", js.undefined)
    
    inline def setStackErrorsVarargs(value: StackError*): Self = StObject.set(x, "StackErrors", js.Array(value*))
    
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
