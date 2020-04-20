package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonClick extends js.Object {
  var buttonType: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def buttonClick(): Unit
}

object AnonButtonClick {
  @scala.inline
  def apply(buttonClick: () => Unit, buttonType: String, styles: StringDictionary[RegisteredStyle[_]]): AnonButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonClick]
  }
}

