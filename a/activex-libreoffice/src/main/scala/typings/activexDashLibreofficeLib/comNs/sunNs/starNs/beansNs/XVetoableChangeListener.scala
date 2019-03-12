package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to receive PropertyChangeEvents whenever a "constrained" property is changed.
  *
  * You can register an {@link XVetoableChangeListener} with a source object so as to be notified of any constrained property updates.
  */
trait XVetoableChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** gets called when a constrained property is changed. */
  def vetoableChange(aEvent: PropertyChangeEvent): scala.Unit
}

object XVetoableChangeListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    vetoableChange: PropertyChangeEvent => scala.Unit
  ): XVetoableChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), vetoableChange = js.Any.fromFunction1(vetoableChange))
  
    __obj.asInstanceOf[XVetoableChangeListener]
  }
}

