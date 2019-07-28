package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events which get fired whenever a bound property is changed. */
trait XPropertiesChangeListener extends XEventListener {
  /**
    * gets called when bound properties are changed.
    * @param aEvent contains a sequence of {@link PropertyChangeEvent} objects which describe the event source and the properites that have changed.
    */
  def propertiesChange(aEvent: SeqEquiv[PropertyChangeEvent]): Unit
}

object XPropertiesChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertiesChange: SeqEquiv[PropertyChangeEvent] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertiesChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertiesChange = js.Any.fromFunction1(propertiesChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPropertiesChangeListener]
  }
}

