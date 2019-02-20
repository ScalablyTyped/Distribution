package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a model component which consists of some settings and one or more spreadsheets. */
@js.native
trait SpreadsheetDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument
     with SpreadsheetDocumentSettings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XActionLockable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XLinkTargetSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XProtectable
     with XSpreadsheetDocument
     with XCalculatable
     with XDocumentAuditing
     with XConsolidatable
     with XGoalSeek
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPagesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier {
  /** contains the collection of area links in the document. */
  var AreaLinks: XAreaLinks = js.native
  /** contains the collection of column label ranges in the document. */
  var ColumnLabelRanges: XLabelRanges = js.native
  /** contains the collection of DDE links in the document. */
  var DDELinks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess = js.native
  /** contains the collection of database ranges in the document. */
  var DatabaseRanges: XDatabaseRanges = js.native
  /** contains the collection of named ranges in the document. */
  var NamedRanges: XNamedRanges = js.native
  /** contains the collection of row label ranges in the document. */
  var RowLabelRanges: XLabelRanges = js.native
  /** contains the collection of sheet links in the document. */
  var SheetLinks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess = js.native
}

