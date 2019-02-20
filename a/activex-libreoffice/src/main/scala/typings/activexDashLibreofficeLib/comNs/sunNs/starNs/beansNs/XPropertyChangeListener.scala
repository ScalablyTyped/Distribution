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

