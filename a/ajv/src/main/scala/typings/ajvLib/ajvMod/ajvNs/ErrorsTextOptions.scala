package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorsTextOptions extends js.Object {
  var dataVar: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorsTextOptions {
  @scala.inline
  def apply(dataVar: java.lang.String = null, separator: java.lang.String = null): ErrorsTextOptions = {
    val __obj = js.Dynamic.literal()
    if (dataVar != null) __obj.updateDynamic("dataVar")(dataVar)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[ErrorsTextOptions]
  }
}

