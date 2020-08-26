package typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends js.Object {
  var codeTheme: js.UndefOr[EditorColours] = js.native
  var config: js.UndefOr[js.Any] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var env: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[IntrospectionResult] = js.native
  var settings: js.UndefOr[ISettings] = js.native
  var subscriptionEndpoint: js.UndefOr[String] = js.native
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  var workspaceName: js.UndefOr[String] = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeTheme(value: EditorColours): Self = this.set("codeTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeTheme: Self = this.set("codeTheme", js.undefined)
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setSchema(value: IntrospectionResult): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSettings(value: ISettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSubscriptionEndpoint(value: String): Self = this.set("subscriptionEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionEndpoint: Self = this.set("subscriptionEndpoint", js.undefined)
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setWorkspaceName(value: String): Self = this.set("workspaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceName: Self = this.set("workspaceName", js.undefined)
  }
  
}

