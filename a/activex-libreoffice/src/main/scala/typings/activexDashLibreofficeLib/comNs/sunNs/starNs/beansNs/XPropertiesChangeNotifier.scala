package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a notifier for changed property values
  * @see XPropertiesChangeListener
  */
trait XPropertiesChangeNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds an {@link XPropertiesChangeListener} to the specified properties with the specified names. */
  def addPropertiesChangeListener(
    PropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Listener: XPropertiesChangeListener
  ): scala.Unit
  /** removes an {@link XPropertiesChangeListener} from the listener list. */
  def removePropertiesChangeListener(
    PropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Listener: XPropertiesChangeListener
  ): scala.Unit
}

object XPropertiesChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XPropertiesChangeListener) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XPropertiesChangeListener) => scala.Unit
  ): XPropertiesChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener))
  
    __obj.asInstanceOf[XPropertiesChangeNotifier]
  }
}

