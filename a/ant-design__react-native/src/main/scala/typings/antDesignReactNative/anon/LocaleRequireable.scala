package typings.antDesignReactNative.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleRequireable extends js.Object {
  var locale: Requireable[js.Object]
}

object LocaleRequireable {
  @scala.inline
  def apply(locale: Requireable[js.Object]): LocaleRequireable = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleRequireable]
  }
}

