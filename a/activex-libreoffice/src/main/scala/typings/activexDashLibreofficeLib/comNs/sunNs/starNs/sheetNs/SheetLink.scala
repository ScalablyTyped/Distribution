package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a sheet link.
  *
  * A sheet link contains the source data of linked sheets, i.e. the URL and sheet name of the external document.
  *
  * To create a linked sheet, the sheet which will be used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link
  * SheetLink} object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  */
trait SheetLink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the name of the filter needed to load the source document. */
  var Filter: java.lang.String
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: java.lang.String
  /** specifies the URL of the source document. */
  var Url: java.lang.String
}

