package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a listener for events related to XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeNotifier
  */
trait XPropertySetInfoChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called whenever changes of a {@link XPropertySetInfo} shall be propagated. */
  def propertySetInfoChange(evt: PropertySetInfoChangeEvent): scala.Unit
}

