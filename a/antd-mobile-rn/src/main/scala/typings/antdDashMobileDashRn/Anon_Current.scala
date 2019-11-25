package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var indicatorStyle: Null
  var mode: String
  var simple: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  var total: Double
  def onChange(): Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: () => Unit,
    simple: Boolean,
    styles: StringDictionary[RegisteredStyle[_]],
    total: Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), simple = simple.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Current]
  }
}

