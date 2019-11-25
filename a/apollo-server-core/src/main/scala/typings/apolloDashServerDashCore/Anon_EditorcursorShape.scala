package typings.apolloDashServerDashCore

import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.CursorShape
import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorcursorShape extends js.Object {
  var `editor.cursorShape`: CursorShape
  var `editor.fontFamily`: String
  var `editor.fontSize`: Double
  var `editor.reuseHeaders`: Boolean
  var `editor.theme`: Theme
  var `general.betaUpdates`: Boolean
  var `queryPlan.hideQueryPlanResponse`: Boolean
  var `request.credentials`: String
  var `tracing.hideTracingResponse`: Boolean
}

object Anon_EditorcursorShape {
  @scala.inline
  def apply(
    `editor.cursorShape`: CursorShape,
    `editor.fontFamily`: String,
    `editor.fontSize`: Double,
    `editor.reuseHeaders`: Boolean,
    `editor.theme`: Theme,
    `general.betaUpdates`: Boolean,
    `queryPlan.hideQueryPlanResponse`: Boolean,
    `request.credentials`: String,
    `tracing.hideTracingResponse`: Boolean
  ): Anon_EditorcursorShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(`editor.cursorShape`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.reuseHeaders")(`editor.reuseHeaders`.asInstanceOf[js.Any])
    __obj.updateDynamic("editor.theme")(`editor.theme`.asInstanceOf[js.Any])
    __obj.updateDynamic("general.betaUpdates")(`general.betaUpdates`.asInstanceOf[js.Any])
    __obj.updateDynamic("queryPlan.hideQueryPlanResponse")(`queryPlan.hideQueryPlanResponse`.asInstanceOf[js.Any])
    __obj.updateDynamic("request.credentials")(`request.credentials`.asInstanceOf[js.Any])
    __obj.updateDynamic("tracing.hideTracingResponse")(`tracing.hideTracingResponse`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EditorcursorShape]
  }
}

