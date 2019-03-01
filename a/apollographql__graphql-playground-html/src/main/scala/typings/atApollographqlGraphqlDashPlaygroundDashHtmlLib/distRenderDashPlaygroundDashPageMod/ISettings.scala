package typings
package atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var `editor.fontFamily`: java.lang.String
  var `editor.fontSize`: scala.Double
  var `editor.reuseHeaders`: scala.Boolean
  var `editor.theme`: Theme
  var `general.betaUpdates`: scala.Boolean
  var `request.credentials`: java.lang.String
  var `tracing.hideTracingResponse`: scala.Boolean
}

object ISettings {
  @scala.inline
  def apply(
    `editor.fontFamily`: java.lang.String,
    `editor.fontSize`: scala.Double,
    `editor.reuseHeaders`: scala.Boolean,
    `editor.theme`: Theme,
    `general.betaUpdates`: scala.Boolean,
    `request.credentials`: java.lang.String,
    `tracing.hideTracingResponse`: scala.Boolean
  ): ISettings = {
    val __obj = js.Dynamic.literal(`editor.fontFamily` = `editor.fontFamily`, `editor.fontSize` = `editor.fontSize`, `editor.reuseHeaders` = `editor.reuseHeaders`, `editor.theme` = `editor.theme`, `general.betaUpdates` = `general.betaUpdates`, `request.credentials` = `request.credentials`, `tracing.hideTracingResponse` = `tracing.hideTracingResponse`)
  
    __obj.asInstanceOf[ISettings]
  }
}

