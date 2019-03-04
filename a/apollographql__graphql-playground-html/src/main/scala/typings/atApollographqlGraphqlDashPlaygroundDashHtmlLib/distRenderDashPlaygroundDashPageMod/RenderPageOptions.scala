package typings
package atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageOptions extends MiddlewareOptions {
  var cdnUrl: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object RenderPageOptions {
  @scala.inline
  def apply(
    version: java.lang.String,
    cdnUrl: java.lang.String = null,
    codeTheme: EditorColours = null,
    config: js.Any = null,
    endpoint: java.lang.String = null,
    env: js.Any = null,
    schema: IntrospectionResult = null,
    settings: ISettings = null,
    subscriptionEndpoint: java.lang.String = null,
    tabs: js.Array[Tab] = null,
    workspaceName: java.lang.String = null
  ): RenderPageOptions = {
    val __obj = js.Dynamic.literal(version = version)
    if (cdnUrl != null) __obj.updateDynamic("cdnUrl")(cdnUrl)
    if (codeTheme != null) __obj.updateDynamic("codeTheme")(codeTheme)
    if (config != null) __obj.updateDynamic("config")(config)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (env != null) __obj.updateDynamic("env")(env)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (subscriptionEndpoint != null) __obj.updateDynamic("subscriptionEndpoint")(subscriptionEndpoint)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (workspaceName != null) __obj.updateDynamic("workspaceName")(workspaceName)
    __obj.asInstanceOf[RenderPageOptions]
  }
}

