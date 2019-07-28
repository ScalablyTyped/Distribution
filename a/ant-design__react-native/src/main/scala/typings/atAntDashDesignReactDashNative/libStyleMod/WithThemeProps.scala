package typings.atAntDashDesignReactDashNative.libStyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeProps[T, S] extends js.Object {
  var styles: js.UndefOr[S] = js.undefined
  def children(styles: T with StringDictionary[js.Any], theme: Theme): ReactNode
  def themeStyles(theme: Theme): T
}

object WithThemeProps {
  @scala.inline
  def apply[T, S](
    children: (T with StringDictionary[js.Any], Theme) => ReactNode,
    themeStyles: Theme => T,
    styles: S = null
  ): WithThemeProps[T, S] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithThemeProps[T, S]]
  }
}

