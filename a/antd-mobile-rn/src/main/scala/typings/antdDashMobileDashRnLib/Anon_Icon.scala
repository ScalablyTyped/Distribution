package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: reactLib.reactMod.Global.JSXNs.Element
  var mode: java.lang.String
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  def onClick(): scala.Unit
}

object Anon_Icon {
  @scala.inline
  def apply(
    icon: reactLib.reactMod.Global.JSXNs.Element,
    mode: java.lang.String,
    onClick: () => scala.Unit,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  ): Anon_Icon = {
    val __obj = js.Dynamic.literal(icon = icon, mode = mode, onClick = js.Any.fromFunction0(onClick), styles = styles)
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

