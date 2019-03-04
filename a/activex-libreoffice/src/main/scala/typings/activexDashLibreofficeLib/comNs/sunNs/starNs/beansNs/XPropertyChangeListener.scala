package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to receive PropertyChangeEvents whenever a bound property is changed. */
trait XPropertyChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when a bound property is changed. */
  def propertyChange(evt: PropertyChangeEvent): scala.Unit
}

object XPropertyChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    propertyChange: js.Function1[PropertyChangeEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertyChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, propertyChange = propertyChange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPropertyChangeListener]
  }
}

