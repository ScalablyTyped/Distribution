package typings.antDesignProLayout

import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def debounce(func: js.Function, wait: Double): js.Any = js.native
  def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Any = js.native
  def genStringToTheme(): String = js.native
  def genStringToTheme(`val`: String): String = js.native
  def genThemeToString(): String = js.native
  def genThemeToString(`val`: String): String = js.native
  def getKeyByPath(item: MenuDataItem): String = js.native
  def getOpenKeysFromMenuData(): js.UndefOr[js.Array[String]] = js.native
  def getOpenKeysFromMenuData(menuData: js.Array[MenuDataItem]): js.UndefOr[js.Array[String]] = js.native
  def guid(): String = js.native
  def isBrowser(): Boolean = js.native
  def isImg(path: String): Boolean = js.native
  def isUrl(path: String): Boolean = js.native
  def useDeepCompareEffect(effect: EffectCallback): Unit = js.native
  def useDeepCompareEffect(effect: EffectCallback, dependencies: js.Object): Unit = js.native
  def usePrevious[T](state: T): js.UndefOr[T] = js.native
}

