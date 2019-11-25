package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelProtection extends js.Object {
  var hideFormula: Boolean
  var `protected`: Boolean
}

object ExcelProtection {
  @scala.inline
  def apply(hideFormula: Boolean, `protected`: Boolean): ExcelProtection = {
    val __obj = js.Dynamic.literal(hideFormula = hideFormula.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelProtection]
  }
}

