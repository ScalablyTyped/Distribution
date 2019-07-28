package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.OfficeDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XActionLockable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XLinkTargetSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPagesSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XProtectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a model component which consists of some settings and one or more spreadsheets. */
@js.native
trait SpreadsheetDocument
  extends OfficeDocument
     with SpreadsheetDocumentSettings
     with XMultiServiceFactory
     with XActionLockable
     with XLinkTargetSupplier
     with XProtectable
     with XSpreadsheetDocument
     with XCalculatable
     with XDocumentAuditing
     with XConsolidatable
     with XGoalSeek
     with XDrawPagesSupplier
     with XStyleFamiliesSupplier
     with XNumberFormatsSupplier {
  /** contains the collection of area links in the document. */
  var AreaLinks: XAreaLinks = js.native
  /** contains the collection of column label ranges in the document. */
  var ColumnLabelRanges: XLabelRanges = js.native
  /** contains the collection of DDE links in the document. */
  var DDELinks: XNameAccess = js.native
  /** contains the collection of database ranges in the document. */
  var DatabaseRanges: XDatabaseRanges = js.native
  /** contains the collection of named ranges in the document. */
  var NamedRanges: XNamedRanges = js.native
  /** contains the collection of row label ranges in the document. */
  var RowLabelRanges: XLabelRanges = js.native
  /** contains the collection of sheet links in the document. */
  var SheetLinks: XNameAccess = js.native
}

