package typings
package atAntDashDesignReactDashNativeLib.libStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeProps[T, S] extends js.Object {
  var styles: js.UndefOr[S] = js.undefined
  def children(styles: T with org.scalablytyped.runtime.StringDictionary[js.Any], theme: Theme): reactLib.reactMod.ReactNode
  def themeStyles(theme: Theme): T
}

object WithThemeProps {
  @scala.inline
  def apply[T, S](
    children: (T with org.scalablytyped.runtime.StringDictionary[js.Any], Theme) => reactLib.reactMod.ReactNode,
    themeStyles: Theme => T,
    styles: S = null
  ): WithThemeProps[T, S] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithThemeProps[T, S]]
  }
}

