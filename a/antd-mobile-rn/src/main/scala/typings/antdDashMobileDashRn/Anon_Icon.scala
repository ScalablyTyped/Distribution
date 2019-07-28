package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: Element
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClick(): Unit
}

object Anon_Icon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): Anon_Icon = {
    val __obj = js.Dynamic.literal(icon = icon, mode = mode, onClick = js.Any.fromFunction0(onClick), styles = styles)
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

