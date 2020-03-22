package typings.apolloServerCore

import typings.apolloServerCore.playgroundMod.RecursivePartial
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.EditorColours
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.ISettings
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.IntrospectionResult
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-core.apollo-server-core/dist/playground.RecursivePartial<@apollographql/graphql-playground-html.@apollographql/graphql-playground-html/dist/render-playground-page.RenderPageOptions> */
trait RecursivePartialRenderPag extends js.Object {
  var cdnUrl: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
  var codeTheme: js.UndefOr[
    EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]]
  ] = js.undefined
  var config: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.undefined
  var endpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
  var env: js.UndefOr[js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]]] = js.undefined
  var faviconUrl: js.UndefOr[
    String | Null | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]]
  ] = js.undefined
  var schema: js.UndefOr[
    IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]]
  ] = js.undefined
  var settings: js.UndefOr[
    ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]]
  ] = js.undefined
  var subscriptionEndpoint: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
  var tabs: js.UndefOr[
    (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]]
  ] = js.undefined
  var title: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
  var version: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
  var workspaceName: js.UndefOr[String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.undefined
}

object RecursivePartialRenderPag {
  @scala.inline
  def apply(
    cdnUrl: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null,
    codeTheme: EditorColours | RecursivePartial[js.UndefOr[EditorColours]] | js.Array[RecursivePartial[_]] = null,
    config: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]] = null,
    endpoint: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null,
    env: js.Any | RecursivePartial[js.UndefOr[_]] | js.Array[RecursivePartial[_]] = null,
    faviconUrl: String | (RecursivePartial[js.UndefOr[String | Null]]) | js.Array[RecursivePartial[_]] = null,
    schema: IntrospectionResult | RecursivePartial[js.UndefOr[IntrospectionResult]] | js.Array[RecursivePartial[_]] = null,
    settings: ISettings | RecursivePartial[js.UndefOr[ISettings]] | js.Array[RecursivePartial[_]] = null,
    subscriptionEndpoint: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null,
    tabs: (js.Array[RecursivePartial[_] | Tab]) | RecursivePartial[js.UndefOr[js.Array[Tab]]] = null,
    title: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null,
    version: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null,
    workspaceName: String | RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]] = null
  ): RecursivePartialRenderPag = {
    val __obj = js.Dynamic.literal()
    if (cdnUrl != null) __obj.updateDynamic("cdnUrl")(cdnUrl.asInstanceOf[js.Any])
    if (codeTheme != null) __obj.updateDynamic("codeTheme")(codeTheme.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (faviconUrl != null) __obj.updateDynamic("faviconUrl")(faviconUrl.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (subscriptionEndpoint != null) __obj.updateDynamic("subscriptionEndpoint")(subscriptionEndpoint.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (workspaceName != null) __obj.updateDynamic("workspaceName")(workspaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialRenderPag]
  }
}

