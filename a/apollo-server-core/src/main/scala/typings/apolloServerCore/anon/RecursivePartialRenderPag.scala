package typings.apolloServerCore.anon

import typings.apolloServerCore.playgroundMod.RecursivePartial
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.EditorColours
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.ISettings
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.IntrospectionResult
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<@apollographql/graphql-playground-html.@apollographql/graphql-playground-html/dist/render-playground-page.RenderPageOptions> */
@js.native
trait RecursivePartialRenderPag extends js.Object {
  var cdnUrl: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var codeTheme: js.UndefOr[
    EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var config: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.native
  var endpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var env: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.native
  var faviconUrl: js.UndefOr[
    String | Null | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]]
  ] = js.native
  var schema: js.UndefOr[
    IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var settings: js.UndefOr[
    ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]]
  ] = js.native
  var subscriptionEndpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var tabs: js.UndefOr[
    (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]]
  ] = js.native
  var title: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var version: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  var workspaceName: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
}

object RecursivePartialRenderPag {
  @scala.inline
  def apply(): RecursivePartialRenderPag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialRenderPag]
  }
  @scala.inline
  implicit class RecursivePartialRenderPagOps[Self <: RecursivePartialRenderPag] (val x: Self) extends AnyVal {
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
    def setCdnUrlVarargs(value: RecursivePartial[js.Any]*): Self = this.set("cdnUrl", js.Array(value :_*))
    @scala.inline
    def setCdnUrl(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("cdnUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdnUrl: Self = this.set("cdnUrl", js.undefined)
    @scala.inline
    def setCodeThemeVarargs(value: RecursivePartial[js.Any]*): Self = this.set("codeTheme", js.Array(value :_*))
    @scala.inline
    def setCodeTheme(value: EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]]): Self = this.set("codeTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeTheme: Self = this.set("codeTheme", js.undefined)
    @scala.inline
    def setConfigVarargs(value: RecursivePartial[js.Any]*): Self = this.set("config", js.Array(value :_*))
    @scala.inline
    def setConfig(value: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setEndpointVarargs(value: RecursivePartial[js.Any]*): Self = this.set("endpoint", js.Array(value :_*))
    @scala.inline
    def setEndpoint(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEnvVarargs(value: RecursivePartial[js.Any]*): Self = this.set("env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFaviconUrlVarargs(value: RecursivePartial[js.Any]*): Self = this.set("faviconUrl", js.Array(value :_*))
    @scala.inline
    def setFaviconUrl(value: String | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]]): Self = this.set("faviconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaviconUrl: Self = this.set("faviconUrl", js.undefined)
    @scala.inline
    def setFaviconUrlNull: Self = this.set("faviconUrl", null)
    @scala.inline
    def setSchemaVarargs(value: RecursivePartial[js.Any]*): Self = this.set("schema", js.Array(value :_*))
    @scala.inline
    def setSchema(
      value: IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]]
    ): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: RecursivePartial[js.Any]*): Self = this.set("settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSubscriptionEndpointVarargs(value: RecursivePartial[js.Any]*): Self = this.set("subscriptionEndpoint", js.Array(value :_*))
    @scala.inline
    def setSubscriptionEndpoint(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("subscriptionEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionEndpoint: Self = this.set("subscriptionEndpoint", js.undefined)
    @scala.inline
    def setTabsVarargs(value: (RecursivePartial[js.Any] | Tab)*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setTitleVarargs(value: RecursivePartial[js.Any]*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersionVarargs(value: RecursivePartial[js.Any]*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWorkspaceNameVarargs(value: RecursivePartial[js.Any]*): Self = this.set("workspaceName", js.Array(value :_*))
    @scala.inline
    def setWorkspaceName(value: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("workspaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceName: Self = this.set("workspaceName", js.undefined)
  }
  
}

