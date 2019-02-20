package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access via index to a collection of area links and inserting and removing area links.
  * @see com.sun.star.sheet.CellAreaLinks
  * @see com.sun.star.sheet.CellAreaLink
  */
trait XAreaLinks
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * creates an area link and adds it to the collection.
    * @param aDestPos the address of the first cell of the range inside the current document.
    * @param aFileName the URL of the source document.
    * @param aSourceArea the name of the range in the source document.  This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of
    * @param aFilter the name of the filter used to load the source document.
    * @param aFilterOptions optional filter options for the specified filter.
    */
  def insertAtPosition(
    aDestPos: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aFileName: java.lang.String,
    aSourceArea: java.lang.String,
    aFilter: java.lang.String,
    aFilterOptions: java.lang.String
  ): scala.Unit
  /** removes an area link from the collection. */
  def removeByIndex(nIndex: scala.Double): scala.Unit
}

