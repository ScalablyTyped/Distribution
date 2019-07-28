package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.gridNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridDataModel} to get notifications about data model changes.
  *
  * Usually you must not implement this interface yourself, but you must notify it correctly if you implement the {@link XGridDataModel} yourself
  *
  * .
  * @since OOo 3.3
  */
trait XGridDataListener extends XEventListener {
  /** is called when existing data in a grid control's data model has been modified. */
  def dataChanged(Event: GridDataEvent): Unit
  /** is called when the title of one or more rows changed. */
  def rowHeadingChanged(Event: GridDataEvent): Unit
  /** is called when one or more rows of data have been inserted into a grid control's data model. */
  def rowsInserted(Event: GridDataEvent): Unit
  /** is called when one or more rows of data have been removed from a grid control's data model. */
  def rowsRemoved(Event: GridDataEvent): Unit
}

object XGridDataListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    dataChanged: GridDataEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rowHeadingChanged: GridDataEvent => Unit,
    rowsInserted: GridDataEvent => Unit,
    rowsRemoved: GridDataEvent => Unit
  ): XGridDataListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dataChanged = js.Any.fromFunction1(dataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowHeadingChanged = js.Any.fromFunction1(rowHeadingChanged), rowsInserted = js.Any.fromFunction1(rowsInserted), rowsRemoved = js.Any.fromFunction1(rowsRemoved))
  
    __obj.asInstanceOf[XGridDataListener]
  }
}

