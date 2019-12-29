package typings.atAntDashDesignProDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenuUtils", JSImport.Namespace)
@js.native
object libSiderMenuSiderMenuUtilsMod extends js.Object {
  def genKeysToArray(menuKey: String): js.Array[String] = js.native
  def getFlatMenuKeys(): js.Array[String] = js.native
  def getFlatMenuKeys(menuData: js.Array[MenuDataItem]): js.Array[String] = js.native
  def getFlatMenus(): StringDictionary[MenuDataItem] = js.native
  def getFlatMenus(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = js.native
  def getMenuMatches(flatMenuKeys: js.UndefOr[scala.Nothing], path: String): js.UndefOr[String] = js.native
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String): js.UndefOr[String] = js.native
  def getSelectedMenuKeys(pathname: String, flatMenus: js.UndefOr[scala.Nothing], flatMenuKeys: js.Array[String]): js.Array[String] = js.native
  def getSelectedMenuKeys(pathname: String, flatMenus: StringDictionary[MenuDataItem], flatMenuKeys: js.Array[String]): js.Array[String] = js.native
}

