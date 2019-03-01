package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for receiving "cursorMoved", "rowChanged", and "rowSetChanged" events posted by, for example, a row set. */
trait XRowSetListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when a row set's cursor is moved.
    * @param event contains information about the event
    */
  def cursorMoved(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is called when a row is inserted, updated, or deleted.
    * @deprecated Deprecated
    * @param event contains information about the event
    * @see com.sun.star.sdb.XRowsChangeListener
    */
  def rowChanged(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is called when the row set has changed, or in other words, when the row set has been reexecuted.
    * @param event contains information about the event
    */
  def rowSetChanged(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XRowSetListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cursorMoved: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rowChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    rowSetChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XRowSetListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cursorMoved")(cursorMoved)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("rowChanged")(rowChanged)
    __obj.updateDynamic("rowSetChanged")(rowSetChanged)
    __obj.asInstanceOf[XRowSetListener]
  }
}

