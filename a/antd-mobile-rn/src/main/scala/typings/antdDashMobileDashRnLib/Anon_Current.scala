package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var indicatorStyle: scala.Null
  var mode: java.lang.String
  var simple: scala.Boolean
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  var total: scala.Double
  def onChange(): scala.Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: scala.Double,
    indicatorStyle: scala.Null,
    mode: java.lang.String,
    onChange: () => scala.Unit,
    simple: scala.Boolean,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]],
    total: scala.Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, indicatorStyle = indicatorStyle, mode = mode, onChange = js.Any.fromFunction0(onChange), simple = simple, styles = styles, total = total)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

