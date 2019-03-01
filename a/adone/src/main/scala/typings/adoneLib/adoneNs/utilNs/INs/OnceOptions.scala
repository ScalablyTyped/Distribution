package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnceOptions extends js.Object {
  var silent: scala.Boolean
}

object OnceOptions {
  @scala.inline
  def apply(silent: scala.Boolean): OnceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[OnceOptions]
  }
}

