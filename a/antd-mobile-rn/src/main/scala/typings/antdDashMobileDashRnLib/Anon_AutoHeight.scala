package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHeight extends js.Object {
  var autoHeight: scala.Boolean
  var clear: scala.Boolean
  var count: scala.Double
  var editable: scala.Boolean
  var error: scala.Boolean
  var keyboardType: java.lang.String
  var last: scala.Boolean
  var rows: scala.Double
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onErrorClick(): scala.Unit
  def onFocus(): scala.Unit
}

object Anon_AutoHeight {
  @scala.inline
  def apply(
    autoHeight: scala.Boolean,
    clear: scala.Boolean,
    count: scala.Double,
    editable: scala.Boolean,
    error: scala.Boolean,
    keyboardType: java.lang.String,
    last: scala.Boolean,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onErrorClick: () => scala.Unit,
    onFocus: () => scala.Unit,
    rows: scala.Double,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  ): Anon_AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, clear = clear, count = count, editable = editable, error = error, keyboardType = keyboardType, last = last, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), rows = rows, styles = styles)
  
    __obj.asInstanceOf[Anon_AutoHeight]
  }
}

