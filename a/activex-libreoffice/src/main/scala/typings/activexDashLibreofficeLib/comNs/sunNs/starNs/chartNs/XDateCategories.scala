package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method getData().
  * @since OOo 3.4
  */
trait XDateCategories extends js.Object {
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

