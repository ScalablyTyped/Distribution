package typings
package agDashGridLib.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelProtection extends js.Object {
  var hideFormula: scala.Boolean
  var `protected`: scala.Boolean
}

object ExcelProtection {
  @scala.inline
  def apply(hideFormula: scala.Boolean, `protected`: scala.Boolean): ExcelProtection = {
    val __obj = js.Dynamic.literal(hideFormula = hideFormula)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ExcelProtection]
  }
}

