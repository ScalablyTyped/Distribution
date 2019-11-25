package typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageOptions extends MiddlewareOptions {
  var cdnUrl: js.UndefOr[String] = js.undefined
  var faviconUrl: js.UndefOr[String | Null] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object RenderPageOptions {
  @scala.inline
  def apply(
    cdnUrl: String = null,
    codeTheme: EditorColours = null,
    config: js.Any = null,
    endpoint: String = null,
    env: js.Any = null,
    faviconUrl: String = null,
    schema: IntrospectionResult = null,
    settings: ISettings = null,
    subscriptionEndpoint: String = null,
    tabs: js.Array[Tab] = null,
    title: String = null,
    version: String = null,
    workspaceName: String = null
  ): RenderPageOptions = {
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
    __obj.asInstanceOf[RenderPageOptions]
  }
}

