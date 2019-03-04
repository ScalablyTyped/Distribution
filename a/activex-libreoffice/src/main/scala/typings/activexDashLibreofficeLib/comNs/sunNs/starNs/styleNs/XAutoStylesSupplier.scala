package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
trait XAutoStylesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  val AutoStyles: XAutoStyles
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  def getAutoStyles(): XAutoStyles
}

object XAutoStylesSupplier {
  @scala.inline
  def apply(
    AutoStyles: XAutoStyles,
    acquire: js.Function0[scala.Unit],
    getAutoStyles: js.Function0[XAutoStyles],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAutoStylesSupplier = {
    val __obj = js.Dynamic.literal(AutoStyles = AutoStyles, acquire = acquire, getAutoStyles = getAutoStyles, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAutoStylesSupplier]
  }
}

