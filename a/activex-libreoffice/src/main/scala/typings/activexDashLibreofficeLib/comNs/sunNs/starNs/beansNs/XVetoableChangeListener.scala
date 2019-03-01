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
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    vetoableChange: js.Function1[PropertyChangeEvent, scala.Unit]
  ): XVetoableChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("vetoableChange")(vetoableChange)
    __obj.asInstanceOf[XVetoableChangeListener]
  }
}

