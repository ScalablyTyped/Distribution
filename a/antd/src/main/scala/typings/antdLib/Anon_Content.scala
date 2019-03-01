package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var Content: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState]
  var Footer: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState]
  var Header: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState]
  var Sider: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutSiderMod.SiderProps, reactLib.reactMod.ReactNs.ComponentState]
}

object Anon_Content {
  @scala.inline
  def apply(
    Content: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState],
    Footer: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState],
    Header: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutLayoutMod.BasicProps, reactLib.reactMod.ReactNs.ComponentState],
    Sider: reactLib.reactMod.ReactNs.ComponentClass[antdLib.libLayoutSiderMod.SiderProps, reactLib.reactMod.ReactNs.ComponentState]
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content")(Content)
    __obj.updateDynamic("Footer")(Footer)
    __obj.updateDynamic("Header")(Header)
    __obj.updateDynamic("Sider")(Sider)
    __obj.asInstanceOf[Anon_Content]
  }
}

