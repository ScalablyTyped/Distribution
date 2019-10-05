package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSaveAsUI extends js.Object {
  var Cancel: Boolean
  val SaveAsUI: Boolean
  val Wb: Workbook
}

object Anon_CancelSaveAsUI {
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean, Wb: Workbook): Anon_CancelSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, SaveAsUI = SaveAsUI, Wb = Wb)
  
    __obj.asInstanceOf[Anon_CancelSaveAsUI]
  }
}

