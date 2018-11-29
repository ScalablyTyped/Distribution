package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends reactLib.reactMod.Component[MenuProps, MenuState, js.Any] {
  var inlineOpenKeys: js.Array[java.lang.String] = js.native
  var switchingModeFromInline: scala.Boolean = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMenu(nextProps: MenuProps, nextContext: antdLib.libLayoutSiderMod.SiderContext): scala.Unit = js.native
  def getChildContext(): antdLib.Anon_AntdMenuThemeLight = js.native
  def getInlineCollapsed(): js.Any = js.native
  def getMenuOpenAnimation(menuMode: MenuMode): js.UndefOr[js.Object] = js.native
  def getRealMenuMode(): js.UndefOr[
    antdLib.antdLibStrings.`inline` | antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical | antdLib.antdLibStrings.`vertical-left` | antdLib.antdLibStrings.`vertical-right`
  ] = js.native
  def handleClick(e: ClickParam): scala.Unit = js.native
  def handleMouseEnter(e: reactLib.MouseEvent): scala.Unit = js.native
  def handleOpenChange(openKeys: js.Array[java.lang.String]): scala.Unit = js.native
  def handleTransitionEnd(e: reactLib.TransitionEvent): scala.Unit = js.native
  def restoreModeVerticalFromInline(): scala.Unit = js.native
  def setOpenKeys(openKeys: js.Array[java.lang.String]): scala.Unit = js.native
}

