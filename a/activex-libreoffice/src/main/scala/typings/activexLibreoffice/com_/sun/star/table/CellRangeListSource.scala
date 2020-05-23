package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.form.binding.XListEntryListener
import typings.activexLibreoffice.com_.sun.star.form.binding.XListEntrySource
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
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
  extends XListEntrySource
     with XComponent
     with XInitialization {
  /** specifies the cell range within a document to which the component is bound. */
  var CellRange: CellRangeAddress
}

object CellRangeListSource {
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    CellRange: CellRangeAddress,
    ListEntryCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addListEntryListener: XListEntryListener => Unit,
    dispose: () => Unit,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeListEntryListener: XListEntryListener => Unit
  ): CellRangeListSource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], CellRange = CellRange.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), dispose = js.Any.fromFunction0(dispose), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
    __obj.asInstanceOf[CellRangeListSource]
  }
}

