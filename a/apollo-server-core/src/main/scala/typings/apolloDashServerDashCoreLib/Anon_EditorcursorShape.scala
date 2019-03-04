package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorcursorShape extends js.Object {
  var `editor.cursorShape`: java.lang.String
  var `editor.fontFamily`: java.lang.String
  var `editor.fontSize`: scala.Double
  var `editor.reuseHeaders`: scala.Boolean
  var `editor.theme`: atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.Theme
  var `general.betaUpdates`: scala.Boolean
  var `request.credentials`: java.lang.String
  var `tracing.hideTracingResponse`: scala.Boolean
}

object Anon_EditorcursorShape {
  @scala.inline
  def apply(
    `editor.cursorShape`: java.lang.String,
    `editor.fontFamily`: java.lang.String,
    `editor.fontSize`: scala.Double,
    `editor.reuseHeaders`: scala.Boolean,
    `editor.theme`: atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.Theme,
    `general.betaUpdates`: scala.Boolean,
    `request.credentials`: java.lang.String,
    `tracing.hideTracingResponse`: scala.Boolean
  ): Anon_EditorcursorShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(`editor.cursorShape`)
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`)
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`)
    __obj.updateDynamic("editor.reuseHeaders")(`editor.reuseHeaders`)
    __obj.updateDynamic("editor.theme")(`editor.theme`)
    __obj.updateDynamic("general.betaUpdates")(`general.betaUpdates`)
    __obj.updateDynamic("request.credentials")(`request.credentials`)
    __obj.updateDynamic("tracing.hideTracingResponse")(`tracing.hideTracingResponse`)
    __obj.asInstanceOf[Anon_EditorcursorShape]
  }
}

