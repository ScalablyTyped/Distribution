package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelStyle extends js.Object {
  var alignment: js.UndefOr[ExcelAlignment] = js.native
  var borders: js.UndefOr[ExcelBorders] = js.native
  var dataType: js.UndefOr[String] = js.native
  var font: js.UndefOr[ExcelFont] = js.native
  var id: js.UndefOr[String] = js.native
  var interior: js.UndefOr[ExcelInterior] = js.native
  var name: js.UndefOr[String] = js.native
  var numberFormat: js.UndefOr[ExcelNumberFormat] = js.native
  var protection: js.UndefOr[ExcelProtection] = js.native
}

object ExcelStyle {
  @scala.inline
  def apply(): ExcelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelStyle]
  }
  @scala.inline
  implicit class ExcelStyleOps[Self <: ExcelStyle] (val x: Self) extends AnyVal {
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
    def setAlignment(value: ExcelAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBorders(value: ExcelBorders): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setFont(value: ExcelFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInterior(value: ExcelInterior): Self = this.set("interior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterior: Self = this.set("interior", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: ExcelNumberFormat): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setProtection(value: ExcelProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
  }
  
}

