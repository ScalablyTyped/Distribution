package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val Description: java.lang.String
  val Sheet: java.lang.String
  val Success: scala.Boolean
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_Description {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Sheet: java.lang.String,
    Success: scala.Boolean,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(Description = Description, Sheet = Sheet, Success = Success, Wb = Wb)
  
    __obj.asInstanceOf[Anon_Description]
  }
}

