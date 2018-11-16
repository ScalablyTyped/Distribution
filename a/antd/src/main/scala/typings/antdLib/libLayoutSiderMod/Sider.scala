package typings
package antdLib.libLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sider
  extends reactLib.reactMod.Component[SiderProps, SiderState, js.Any] {
  var mql: js.Any = js.native
  var uniqueId: js.Any = js.native
  def belowShowChange(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSider(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSider(): scala.Unit = js.native
  def getChildContext(): antdLib.Anon_SiderCollapsedCollapsedWidth = js.native
  def responsiveHandler(mql: stdLib.MediaQueryList): scala.Unit = js.native
  def responsiveHandler(mql: stdLib.MediaQueryListEvent): scala.Unit = js.native
  def setCollapsed(collapsed: scala.Boolean, `type`: CollapseType): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

