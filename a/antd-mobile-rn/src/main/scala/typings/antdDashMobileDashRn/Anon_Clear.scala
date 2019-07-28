package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  var clear: Boolean
  var editable: Boolean
  var error: Boolean
  var extra: String
  var labelNumber: Double
  var labelPosition: String
  var last: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  var textAlign: String
  var `type`: String
  def onBlur(): Unit
  def onChange(): Unit
  def onErrorClick(): Unit
  def onExtraClick(): Unit
  def onFocus(): Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: Boolean,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    labelPosition: String,
    last: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onExtraClick: () => Unit,
    onFocus: () => Unit,
    styles: StringDictionary[RegisteredStyle[_]],
    textAlign: String,
    `type`: String
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, editable = editable, error = error, extra = extra, labelNumber = labelNumber, labelPosition = labelPosition, last = last, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), styles = styles, textAlign = textAlign)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Clear]
  }
}

