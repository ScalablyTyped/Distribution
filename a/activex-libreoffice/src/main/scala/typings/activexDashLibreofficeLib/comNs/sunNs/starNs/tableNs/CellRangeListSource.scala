package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the a source of list entries coming from a cell range in a table document
  *
  * The component cannot be instantiated at a global service factory, instead it's usually provided by a document instance.
  * @see com.sun.star.document.OfficeDocument
  */
trait CellRangeListSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** specifies the cell range within a document to which the component is bound. */
  var CellRange: CellRangeAddress
}

object CellRangeListSource {
  @scala.inline
  def apply(
    AllListEntries: stdLib.SafeArray[java.lang.String],
    CellRange: CellRangeAddress,
    ListEntryCount: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addListEntryListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener => scala.Unit,
    dispose: () => scala.Unit,
    getAllListEntries: () => stdLib.SafeArray[java.lang.String],
    getListEntry: scala.Double => java.lang.String,
    getListEntryCount: () => scala.Double,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeListEntryListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener => scala.Unit
  ): CellRangeListSource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, CellRange = CellRange, ListEntryCount = ListEntryCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), dispose = js.Any.fromFunction0(dispose), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
  
    __obj.asInstanceOf[CellRangeListSource]
  }
}

