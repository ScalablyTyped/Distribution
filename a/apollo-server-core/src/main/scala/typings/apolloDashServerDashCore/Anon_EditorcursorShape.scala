package typings.apolloDashServerDashCore

import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.CursorShape
import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorcursorShape extends js.Object {
  @JSName("editor.cursorShape")
  var editorDotcursorShape: CursorShape
  @JSName("editor.fontFamily")
  var editorDotfontFamily: String
  @JSName("editor.fontSize")
  var editorDotfontSize: Double
  @JSName("editor.reuseHeaders")
  var editorDotreuseHeaders: Boolean
  @JSName("editor.theme")
  var editorDottheme: Theme
  @JSName("general.betaUpdates")
  var generalDotbetaUpdates: Boolean
  @JSName("queryPlan.hideQueryPlanResponse")
  var queryPlanDothideQueryPlanResponse: Boolean
  @JSName("request.credentials")
  var requestDotcredentials: String
  @JSName("tracing.hideTracingResponse")
  var tracingDothideTracingResponse: Boolean
}

object Anon_EditorcursorShape {
  @scala.inline
  def apply(
    editorDotcursorShape: CursorShape,
    editorDotfontFamily: String,
    editorDotfontSize: Double,
    editorDotreuseHeaders: Boolean,
    editorDottheme: Theme,
    generalDotbetaUpdates: Boolean,
    queryPlanDothideQueryPlanResponse: Boolean,
    requestDotcredentials: String,
    tracingDothideTracingResponse: Boolean
  ): Anon_EditorcursorShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(editorDotcursorShape.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(editorDotfontFamily.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(editorDotfontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.reuseHeaders")(editorDotreuseHeaders.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.theme")(editorDottheme.asInstanceOf[js.Any])
    __obj.updateDynamic("general.betaUpdates")(generalDotbetaUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("queryPlan.hideQueryPlanResponse")(queryPlanDothideQueryPlanResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("request.credentials")(requestDotcredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("tracing.hideTracingResponse")(tracingDothideTracingResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EditorcursorShape]
  }
}

