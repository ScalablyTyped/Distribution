package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlMap extends js.Object {
  var AdjustColumnWidth: Boolean = js.native
  var AppendOnImport: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val DataBinding: XmlDataBinding = js.native
  @JSName("Excel.XmlMap_typekey")
  var ExcelDotXmlMap_typekey: XmlMap = js.native
  val IsExportable: Boolean = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var PreserveColumnFilter: Boolean = js.native
  var PreserveNumberFormatting: Boolean = js.native
  val RootElementName: String = js.native
  val RootElementNamespace: XmlNamespace = js.native
  var SaveDataSourceDefinition: Boolean = js.native
  @JSName("Schemas")
  val Schemas_Original: XmlSchemas = js.native
  var ShowImportExportValidationErrors: Boolean = js.native
  val WorkbookConnection: typings.activexExcel.Excel.WorkbookConnection = js.native
  val _Default: String = js.native
  def Delete(): Unit = js.native
  def Export(Url: String): XlXmlExportResult = js.native
  def Export(Url: String, Overwrite: Boolean): XlXmlExportResult = js.native
  def ExportXml(Data: String): XlXmlExportResult = js.native
  def Import(Url: String): XlXmlImportResult = js.native
  def Import(Url: String, Overwrite: Boolean): XlXmlImportResult = js.native
  def ImportXml(XmlData: String): XlXmlImportResult = js.native
  def ImportXml(XmlData: String, Overwrite: Boolean): XlXmlImportResult = js.native
  def Schemas(Index: String): XmlSchema = js.native
  def Schemas(Index: Double): XmlSchema = js.native
}

