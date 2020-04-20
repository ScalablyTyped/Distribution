package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod._Global_.JSX.Element
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: Element
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

