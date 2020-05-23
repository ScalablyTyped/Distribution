package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: Element
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClick(): Unit
}

object Icon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

