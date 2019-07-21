package typings
package atAntDashDesignProDashLayoutLib.esSiderMenuBaseMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMenu
  extends reactLib.reactMod.Component[BaseMenuProps, js.Object, js.Any] {
  var warp: js.UndefOr[stdLib.HTMLDivElement] = js.native
  def conversionPath(path: java.lang.String): java.lang.String = js.native
  def getIntlName(item: atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem): js.UndefOr[java.lang.String] = js.native
  /**
    * 判断是否是http链接.返回 Link 或 a
    * Judge whether it is http link.return a or Link
    * @memberof SiderMenu
    */
  def getMenuItemPath(item: atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem): js.UndefOr[js.Object | scala.Null] = js.native
  /**
    * 获得菜单子节点
    */
  def getNavMenuItems(): js.Array[reactLib.reactMod.ReactNode] = js.native
  def getNavMenuItems(menusData: js.Array[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]): js.Array[reactLib.reactMod.ReactNode] = js.native
  def getPopupContainer(fixedHeader: scala.Boolean, layout: java.lang.String): stdLib.HTMLElement = js.native
  def getRef(ref: stdLib.HTMLDivElement): scala.Unit = js.native
  def getSelectedMenuKeys(): js.Array[java.lang.String] = js.native
  def getSelectedMenuKeys(pathname: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * get SubMenu or Item
    */
  def getSubMenuOrItem(item: atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem): reactLib.reactMod.ReactNode = js.native
}

