package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events which get fired whenever the state of a bound property is changed. */
trait XPropertyStateChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when a bound property's state is changed.
    * @param aEvent describes the event source and the property that has changed.
    */
  def propertyStateChange(aEvent: PropertyStateChangeEvent): scala.Unit
}

