package typings.antDesignReactNative

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocaleRequireable extends js.Object {
  var locale: Requireable[js.Object]
}

object AnonLocaleRequireable {
  @scala.inline
  def apply(locale: Requireable[js.Object]): AnonLocaleRequireable = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocaleRequireable]
  }
}

