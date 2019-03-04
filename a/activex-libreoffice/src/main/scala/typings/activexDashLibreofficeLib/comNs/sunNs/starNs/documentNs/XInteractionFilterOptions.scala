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

object XInteractionFilterOptions {
  @scala.inline
  def apply(
    FilterOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    getFilterOptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setFilterOptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): XInteractionFilterOptions = {
    val __obj = js.Dynamic.literal(FilterOptions = FilterOptions, acquire = acquire, getFilterOptions = getFilterOptions, queryInterface = queryInterface, release = release, select = select, setFilterOptions = setFilterOptions)
  
    __obj.asInstanceOf[XInteractionFilterOptions]
  }
}

