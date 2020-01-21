package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelStyle extends js.Object {
  var alignment: js.UndefOr[ExcelAlignment] = js.undefined
  var borders: js.UndefOr[ExcelBorders] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[ExcelFont] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var interior: js.UndefOr[ExcelInterior] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numberFormat: js.UndefOr[ExcelNumberFormat] = js.undefined
  var protection: js.UndefOr[ExcelProtection] = js.undefined
}

object ExcelStyle {
  @scala.inline
  def apply(
    alignment: ExcelAlignment = null,
    borders: ExcelBorders = null,
    dataType: String = null,
    font: ExcelFont = null,
    id: String = null,
    interior: ExcelInterior = null,
    name: String = null,
    numberFormat: ExcelNumberFormat = null,
    protection: ExcelProtection = null
  ): ExcelStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interior != null) __obj.updateDynamic("interior")(interior.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelStyle]
  }
}

