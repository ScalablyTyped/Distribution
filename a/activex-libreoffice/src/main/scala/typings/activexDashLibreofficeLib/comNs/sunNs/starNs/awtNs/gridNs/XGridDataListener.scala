package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

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
trait XGridDataListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when existing data in a grid control's data model has been modified. */
  def dataChanged(Event: GridDataEvent): scala.Unit
  /** is called when the title of one or more rows changed. */
  def rowHeadingChanged(Event: GridDataEvent): scala.Unit
  /** is called when one or more rows of data have been inserted into a grid control's data model. */
  def rowsInserted(Event: GridDataEvent): scala.Unit
  /** is called when one or more rows of data have been removed from a grid control's data model. */
  def rowsRemoved(Event: GridDataEvent): scala.Unit
}

object XGridDataListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    dataChanged: GridDataEvent => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    rowHeadingChanged: GridDataEvent => scala.Unit,
    rowsInserted: GridDataEvent => scala.Unit,
    rowsRemoved: GridDataEvent => scala.Unit
  ): XGridDataListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dataChanged = js.Any.fromFunction1(dataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowHeadingChanged = js.Any.fromFunction1(rowHeadingChanged), rowsInserted = js.Any.fromFunction1(rowsInserted), rowsRemoved = js.Any.fromFunction1(rowsRemoved))
  
    __obj.asInstanceOf[XGridDataListener]
  }
}

