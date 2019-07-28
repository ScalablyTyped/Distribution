package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
  val Wb: Workbook
}

object Anon_Description {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean, Wb: Workbook): Anon_Description = {
    val __obj = js.Dynamic.literal(Description = Description, Sheet = Sheet, Success = Success, Wb = Wb)
  
    __obj.asInstanceOf[Anon_Description]
  }
}

