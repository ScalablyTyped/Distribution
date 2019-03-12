package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies support for indirect manipulation of a string list */
trait XListEntrySink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the current source for the list entries of the component. */
  var ListEntrySource: XListEntrySource
  /** retrieves the current source for the list entries of the component. */
  def getListEntrySource(): XListEntrySource
  /**
    * sets the new source for the list entries of the component
    *
    * The list represented by this component will be cleared, and initially filled with the entries from the new list source.
    * @param Source the new source for the list entries. May be `NULL` , in this case, the current source is revoked.
    */
  def setListEntrySource(Source: XListEntrySource): scala.Unit
}

object XListEntrySink {
  @scala.inline
  def apply(
    ListEntrySource: XListEntrySource,
    acquire: () => scala.Unit,
    getListEntrySource: () => XListEntrySource,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setListEntrySource: XListEntrySource => scala.Unit
  ): XListEntrySink = {
    val __obj = js.Dynamic.literal(ListEntrySource = ListEntrySource, acquire = js.Any.fromFunction0(acquire), getListEntrySource = js.Any.fromFunction0(getListEntrySource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setListEntrySource = js.Any.fromFunction1(setListEntrySource))
  
    __obj.asInstanceOf[XListEntrySink]
  }
}

