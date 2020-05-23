package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeStyles extends js.Object {
  def themeStyles(): Unit
}

object ThemeStyles {
  @scala.inline
  def apply(themeStyles: () => Unit): ThemeStyles = {
    val __obj = js.Dynamic.literal(themeStyles = js.Any.fromFunction0(themeStyles))
    __obj.asInstanceOf[ThemeStyles]
  }
}

