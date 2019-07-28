package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorsTextOptions extends js.Object {
  var dataVar: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object ErrorsTextOptions {
  @scala.inline
  def apply(dataVar: String = null, separator: String = null): ErrorsTextOptions = {
    val __obj = js.Dynamic.literal()
    if (dataVar != null) __obj.updateDynamic("dataVar")(dataVar)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[ErrorsTextOptions]
  }
}

