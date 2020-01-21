package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeStyles extends js.Object {
  def themeStyles(): Unit
}

object AnonThemeStyles {
  @scala.inline
  def apply(themeStyles: () => Unit): AnonThemeStyles = {
    val __obj = js.Dynamic.literal(themeStyles = js.Any.fromFunction0(themeStyles))
  
    __obj.asInstanceOf[AnonThemeStyles]
  }
}

