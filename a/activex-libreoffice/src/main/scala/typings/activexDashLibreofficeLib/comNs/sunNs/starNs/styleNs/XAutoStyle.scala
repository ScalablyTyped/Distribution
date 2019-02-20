package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to a single automatic style. */
trait XAutoStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates {
  /** returns a sequence of all properties that are set in the style */
  val Properties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /** returns a sequence of all properties that are set in the style */
  def getProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
}

