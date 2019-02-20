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

