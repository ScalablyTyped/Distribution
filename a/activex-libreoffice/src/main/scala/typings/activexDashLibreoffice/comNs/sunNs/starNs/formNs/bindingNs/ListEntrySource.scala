package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a component which provides a list of string entries */
trait ListEntrySource
  extends XListEntrySource
     with XComponent

object ListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    ListEntryCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addListEntryListener: XListEntryListener => Unit,
    dispose: () => Unit,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeListEntryListener: XListEntryListener => Unit
  ): ListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, ListEntryCount = ListEntryCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), dispose = js.Any.fromFunction0(dispose), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
  
    __obj.asInstanceOf[ListEntrySource]
  }
}

