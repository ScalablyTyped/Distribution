package typings
package agDashGridLib.distLibCsvCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "CsvCreator")
@js.native
class CsvCreator ()
  extends BaseCreator[
      java.lang.String, 
      CsvSerializingSession, 
      agDashGridLib.distLibExportParamsMod.CsvExportParams
    ] {
  var columnController: js.Any = js.native
  var downloader: js.Any = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  var gridSerializer: js.Any = js.native
  var valueService: js.Any = js.native
  def exportDataAsCsv(): java.lang.String = js.native
  def exportDataAsCsv(params: agDashGridLib.distLibExportParamsMod.CsvExportParams): java.lang.String = js.native
  def getDataAsCsv(): java.lang.String = js.native
  def getDataAsCsv(params: agDashGridLib.distLibExportParamsMod.CsvExportParams): java.lang.String = js.native
  def postConstruct(): scala.Unit = js.native
}

