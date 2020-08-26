package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelNumberFormat extends js.Object {
  var format: String = js.native
}

object ExcelNumberFormat {
  @scala.inline
  def apply(format: String): ExcelNumberFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelNumberFormat]
  }
  @scala.inline
  implicit class ExcelNumberFormatOps[Self <: ExcelNumberFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

