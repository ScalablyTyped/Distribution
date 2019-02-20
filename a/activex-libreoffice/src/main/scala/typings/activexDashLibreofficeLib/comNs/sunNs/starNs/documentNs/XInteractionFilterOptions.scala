package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to return filter options from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionFilterOptions
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  var FilterOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  def getFilterOptions(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Store results to the continuation.
    * @param rProperties the list of properties containing filter options.
    */
  def setFilterOptions(
    rProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

