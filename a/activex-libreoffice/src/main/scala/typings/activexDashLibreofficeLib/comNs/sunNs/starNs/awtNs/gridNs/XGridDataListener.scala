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
    acquire: js.Function0[scala.Unit],
    dataChanged: js.Function1[GridDataEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rowHeadingChanged: js.Function1[GridDataEvent, scala.Unit],
    rowsInserted: js.Function1[GridDataEvent, scala.Unit],
    rowsRemoved: js.Function1[GridDataEvent, scala.Unit]
  ): XGridDataListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, dataChanged = dataChanged, disposing = disposing, queryInterface = queryInterface, release = release, rowHeadingChanged = rowHeadingChanged, rowsInserted = rowsInserted, rowsRemoved = rowsRemoved)
  
    __obj.asInstanceOf[XGridDataListener]
  }
}

