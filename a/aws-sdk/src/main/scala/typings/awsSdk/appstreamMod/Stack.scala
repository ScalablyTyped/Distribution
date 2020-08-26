package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints. 
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of the stack.
    */
  var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.native
  /**
    * The ARN of the stack.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The time the stack was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
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
  var Name: String = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsSdk.appstreamMod.RedirectURL] = js.native
  /**
    * The errors for the stack.
    */
  var StackErrors: js.UndefOr[typings.awsSdk.appstreamMod.StackErrors] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object Stack {
  @scala.inline
  def apply(Name: String): Stack = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  @scala.inline
  implicit class StackOps[Self <: Stack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = this.set("AccessEndpoints", js.Array(value :_*))
    @scala.inline
    def setAccessEndpoints(value: AccessEndpointList): Self = this.set("AccessEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessEndpoints: Self = this.set("AccessEndpoints", js.undefined)
    @scala.inline
    def setApplicationSettings(value: ApplicationSettingsResponse): Self = this.set("ApplicationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationSettings: Self = this.set("ApplicationSettings", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = this.set("EmbedHostDomains", js.Array(value :_*))
    @scala.inline
    def setEmbedHostDomains(value: EmbedHostDomains): Self = this.set("EmbedHostDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedHostDomains: Self = this.set("EmbedHostDomains", js.undefined)
    @scala.inline
    def setFeedbackURL(value: FeedbackURL): Self = this.set("FeedbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackURL: Self = this.set("FeedbackURL", js.undefined)
    @scala.inline
    def setRedirectURL(value: RedirectURL): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectURL: Self = this.set("RedirectURL", js.undefined)
    @scala.inline
    def setStackErrorsVarargs(value: StackError*): Self = this.set("StackErrors", js.Array(value :_*))
    @scala.inline
    def setStackErrors(value: StackErrors): Self = this.set("StackErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackErrors: Self = this.set("StackErrors", js.undefined)
    @scala.inline
    def setStorageConnectorsVarargs(value: StorageConnector*): Self = this.set("StorageConnectors", js.Array(value :_*))
    @scala.inline
    def setStorageConnectors(value: StorageConnectorList): Self = this.set("StorageConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageConnectors: Self = this.set("StorageConnectors", js.undefined)
    @scala.inline
    def setUserSettingsVarargs(value: UserSetting*): Self = this.set("UserSettings", js.Array(value :_*))
    @scala.inline
    def setUserSettings(value: UserSettingList): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
  
}

