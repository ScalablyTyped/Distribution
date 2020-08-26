package typings.antDesignReactNative.libStyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeProps[T, S] extends js.Object {
  var styles: js.UndefOr[S] = js.native
  def children(styles: T with StringDictionary[js.Any], theme: Theme): ReactNode = js.native
  def themeStyles(theme: Theme): T = js.native
}

object WithThemeProps {
  @scala.inline
  def apply[T, S](children: (T with StringDictionary[js.Any], Theme) => ReactNode, themeStyles: Theme => T): WithThemeProps[T, S] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
    __obj.asInstanceOf[WithThemeProps[T, S]]
  }
  @scala.inline
  implicit class WithThemePropsOps[Self <: WithThemeProps[_, _], T, S] (val x: Self with (WithThemeProps[T, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: (T with StringDictionary[js.Any], Theme) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setThemeStyles(value: Theme => T): Self = this.set("themeStyles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: S): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

