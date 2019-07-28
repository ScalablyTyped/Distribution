package typings.agDashGrid.distLibCsvCreatorMod

import typings.agDashGrid.distLibExportParamsMod.CsvExportParams
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "CsvCreator")
@js.native
class CsvCreator () extends BaseCreator[String, CsvSerializingSession, CsvExportParams] {
  var columnController: js.Any = js.native
  var downloader: js.Any = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var gridSerializer: js.Any = js.native
  var valueService: js.Any = js.native
  def exportDataAsCsv(): String = js.native
  def exportDataAsCsv(params: CsvExportParams): String = js.native
  def getDataAsCsv(): String = js.native
  def getDataAsCsv(params: CsvExportParams): String = js.native
  def postConstruct(): Unit = js.native
}

