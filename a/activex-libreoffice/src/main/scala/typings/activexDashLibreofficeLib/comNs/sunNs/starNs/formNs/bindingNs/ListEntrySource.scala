package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a component which provides a list of string entries */
trait ListEntrySource
  extends XListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object ListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: stdLib.SafeArray[java.lang.String],
    ListEntryCount: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addListEntryListener: XListEntryListener => scala.Unit,
    dispose: () => scala.Unit,
    getAllListEntries: () => stdLib.SafeArray[java.lang.String],
    getListEntry: scala.Double => java.lang.String,
    getListEntryCount: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeListEntryListener: XListEntryListener => scala.Unit
  ): ListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, ListEntryCount = ListEntryCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), dispose = js.Any.fromFunction0(dispose), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
  
    __obj.asInstanceOf[ListEntrySource]
  }
}

