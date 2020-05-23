package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: Double
  var indicatorStyle: Null
  var mode: String
  var simple: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  var total: Double
  def onChange(): Unit
}

object Current {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: () => Unit,
    simple: Boolean,
    styles: StringDictionary[RegisteredStyle[_]],
    total: Double
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), simple = simple.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

