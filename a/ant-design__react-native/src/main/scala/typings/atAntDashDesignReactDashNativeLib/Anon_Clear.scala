package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  var clear: scala.Boolean
  var editable: scala.Boolean
  var error: scala.Boolean
  var extra: java.lang.String
  var labelNumber: scala.Double
  var labelPosition: java.lang.String
  var last: scala.Boolean
  var textAlign: java.lang.String
  var `type`: java.lang.String
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onErrorClick(): scala.Unit
  def onExtraClick(): scala.Unit
  def onFocus(): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: scala.Boolean,
    editable: scala.Boolean,
    error: scala.Boolean,
    extra: java.lang.String,
    labelNumber: scala.Double,
    labelPosition: java.lang.String,
    last: scala.Boolean,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onErrorClick: () => scala.Unit,
    onExtraClick: () => scala.Unit,
    onFocus: () => scala.Unit,
    textAlign: java.lang.String,
    `type`: java.lang.String
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, editable = editable, error = error, extra = extra, labelNumber = labelNumber, labelPosition = labelPosition, last = last, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), textAlign = textAlign)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Clear]
  }
}

