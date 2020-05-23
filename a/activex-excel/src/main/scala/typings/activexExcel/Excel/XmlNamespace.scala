package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlNamespace extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.XmlNamespace_typekey")
  var ExcelDotXmlNamespace_typekey: XmlNamespace
  val Parent: js.Any
  val Prefix: String
  val Uri: String
  val _Default: String
}

object XmlNamespace {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotXmlNamespace_typekey: XmlNamespace,
    Parent: js.Any,
    Prefix: String,
    Uri: String,
    _Default: String
  ): XmlNamespace = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlNamespace_typekey")(ExcelDotXmlNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlNamespace]
  }
}

