package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies support for indirect manipulation of a string list */
trait XListEntrySink extends XInterface {
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
  def setListEntrySource(Source: XListEntrySource): Unit
}

object XListEntrySink {
  @scala.inline
  def apply(
    ListEntrySource: XListEntrySource,
    acquire: () => Unit,
    getListEntrySource: () => XListEntrySource,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setListEntrySource: XListEntrySource => Unit
  ): XListEntrySink = {
    val __obj = js.Dynamic.literal(ListEntrySource = ListEntrySource.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getListEntrySource = js.Any.fromFunction0(getListEntrySource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setListEntrySource = js.Any.fromFunction1(setListEntrySource))
    __obj.asInstanceOf[XListEntrySink]
  }
}

