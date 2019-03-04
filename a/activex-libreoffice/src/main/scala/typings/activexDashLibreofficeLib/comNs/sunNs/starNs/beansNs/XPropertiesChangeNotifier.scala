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
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XPropertiesChangeListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XPropertiesChangeListener, 
      scala.Unit
    ]
  ): XPropertiesChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener)
  
    __obj.asInstanceOf[XPropertiesChangeNotifier]
  }
}

