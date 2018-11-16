package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XmlMap")
@js.native
class XmlMap protected () extends js.Object {
  var AdjustColumnWidth: scala.Boolean = js.native
  var AppendOnImport: scala.Boolean = js.native
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  val DataBinding: XmlDataBinding = js.native
  var `Excel.XmlMap_typekey`: XmlMap = js.native
  val IsExportable: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var PreserveColumnFilter: scala.Boolean = js.native
  var PreserveNumberFormatting: scala.Boolean = js.native
  val RootElementName: java.lang.String = js.native
  val RootElementNamespace: XmlNamespace = js.native
  var SaveDataSourceDefinition: scala.Boolean = js.native
  @JSName("Schemas")
  val Schemas_Original: XmlSchemas = js.native
  var ShowImportExportValidationErrors: scala.Boolean = js.native
  val WorkbookConnection: WorkbookConnection = js.native
  val _Default: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Export(Url: java.lang.String): XlXmlExportResult = js.native
  def Export(Url: java.lang.String, Overwrite: scala.Boolean): XlXmlExportResult = js.native
  def ExportXml(Data: java.lang.String): XlXmlExportResult = js.native
  def Import(Url: java.lang.String): XlXmlImportResult = js.native
  def Import(Url: java.lang.String, Overwrite: scala.Boolean): XlXmlImportResult = js.native
  def ImportXml(XmlData: java.lang.String): XlXmlImportResult = js.native
  def ImportXml(XmlData: java.lang.String, Overwrite: scala.Boolean): XlXmlImportResult = js.native
  def Schemas(Index: java.lang.String): XmlSchema = js.native
  def Schemas(Index: scala.Double): XmlSchema = js.native
}

