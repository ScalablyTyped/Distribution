package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagOptions extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var DisplaySmartTags: XlSmartTagDisplayMode
  var EmbedSmartTags: Boolean
  @JSName("Excel.SmartTagOptions_typekey")
  var ExcelDotSmartTagOptions_typekey: SmartTagOptions
  val Parent: js.Any
}

object SmartTagOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplaySmartTags: XlSmartTagDisplayMode,
    EmbedSmartTags: Boolean,
    ExcelDotSmartTagOptions_typekey: SmartTagOptions,
    Parent: js.Any
  ): SmartTagOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplaySmartTags = DisplaySmartTags.asInstanceOf[js.Any], EmbedSmartTags = EmbedSmartTags.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagOptions_typekey")(ExcelDotSmartTagOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagOptions]
  }
}

