package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonClick extends js.Object {
  var buttonType: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def buttonClick(): Unit
}

object Anon_ButtonClick {
  @scala.inline
  def apply(buttonClick: () => Unit, buttonType: String, styles: StringDictionary[RegisteredStyle[_]]): Anon_ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType, styles = styles)
  
    __obj.asInstanceOf[Anon_ButtonClick]
  }
}

