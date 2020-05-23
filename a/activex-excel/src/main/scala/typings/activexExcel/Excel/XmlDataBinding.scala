package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlDataBinding extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding
  val Parent: js.Any
  val SourceUrl: String
  val _Default: String
  def ClearSettings(): Unit
  def LoadSettings(Url: String): Unit
  def Refresh(): XlXmlImportResult
}

object XmlDataBinding {
  @scala.inline
  def apply(
    Application: Application,
    ClearSettings: () => Unit,
    Creator: XlCreator,
    ExcelDotXmlDataBinding_typekey: XmlDataBinding,
    LoadSettings: String => Unit,
    Parent: js.Any,
    Refresh: () => XlXmlImportResult,
    SourceUrl: String,
    _Default: String
  ): XmlDataBinding = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearSettings = js.Any.fromFunction0(ClearSettings), Creator = Creator.asInstanceOf[js.Any], LoadSettings = js.Any.fromFunction1(LoadSettings), Parent = Parent.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), SourceUrl = SourceUrl.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlDataBinding_typekey")(ExcelDotXmlDataBinding_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDataBinding]
  }
}

