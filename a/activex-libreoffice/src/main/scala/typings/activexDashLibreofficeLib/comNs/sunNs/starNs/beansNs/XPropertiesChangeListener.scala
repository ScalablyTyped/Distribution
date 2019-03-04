package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events which get fired whenever a bound property is changed. */
trait XPropertiesChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called when bound properties are changed.
    * @param aEvent contains a sequence of {@link PropertyChangeEvent} objects which describe the event source and the properites that have changed.
    */
  def propertiesChange(aEvent: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyChangeEvent]): scala.Unit
}

object XPropertiesChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    propertiesChange: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyChangeEvent], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertiesChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, propertiesChange = propertiesChange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPropertiesChangeListener]
  }
}

