package typings.agGrid.exportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvExportParams extends ExportParams[String] {
  var columnSeparator: js.UndefOr[String] = js.native
}

object CsvExportParams {
  @scala.inline
  def apply(): CsvExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvExportParams]
  }
  @scala.inline
  implicit class CsvExportParamsOps[Self <: CsvExportParams] (val x: Self) extends AnyVal {
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
    def setColumnSeparator(value: String): Self = this.set("columnSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSeparator: Self = this.set("columnSeparator", js.undefined)
  }
  
}

