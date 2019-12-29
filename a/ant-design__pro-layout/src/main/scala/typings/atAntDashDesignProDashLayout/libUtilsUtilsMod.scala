package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.react.reactMod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/utils/utils", JSImport.Namespace)
@js.native
object libUtilsUtilsMod extends js.Object {
  def genKeyByPath(path: String): String = js.native
  def getKeyByPath(path: String): String = js.native
  def getOpenKeysFromMenuData(): js.UndefOr[js.Array[String]] = js.native
  def getOpenKeysFromMenuData(menuData: js.Array[MenuDataItem]): js.UndefOr[js.Array[String]] = js.native
  def guid(): String = js.native
  def isBrowser(): Boolean = js.native
  def isUrl(path: String): Boolean = js.native
  def useDeepCompareEffect(effect: EffectCallback): Unit = js.native
  def useDeepCompareEffect(effect: EffectCallback, dependencies: js.Object): Unit = js.native
}

