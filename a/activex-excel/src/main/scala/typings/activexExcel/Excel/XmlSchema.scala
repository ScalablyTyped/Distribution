package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchema extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.XmlSchema_typekey")
  var ExcelDotXmlSchema_typekey: XmlSchema
  val Name: String
  val Namespace: XmlNamespace
  val Parent: js.Any
  val XML: String
}

object XmlSchema {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotXmlSchema_typekey: XmlSchema,
    Name: String,
    Namespace: XmlNamespace,
    Parent: js.Any,
    XML: String
  ): XmlSchema = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlSchema_typekey")(ExcelDotXmlSchema_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlSchema]
  }
}

