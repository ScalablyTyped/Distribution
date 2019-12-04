package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutNumbers.`false`
import typings.atAntDashDesignProDashLayout.libSiderMenuBaseMenuMod.BaseMenuProps
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenuUtils", JSImport.Namespace)
@js.native
object libSiderMenuSiderMenuUtilsMod extends js.Object {
  def getDefaultCollapsedSubMenus(props: BaseMenuProps): `false` | js.Array[String] = js.native
  def getFlatMenuKeys(): js.Array[String] = js.native
  def getFlatMenuKeys(menuData: js.Array[MenuDataItem]): js.Array[String] = js.native
  def getMenuMatches(flatMenuKeys: js.UndefOr[scala.Nothing], path: String): js.Array[String] = js.native
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String): js.Array[String] = js.native
}

