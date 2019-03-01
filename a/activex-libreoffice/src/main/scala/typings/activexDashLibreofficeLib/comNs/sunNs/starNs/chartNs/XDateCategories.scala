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

object XDateCategories {
  @scala.inline
  def apply(
    DateCategories: activexDashInteropLib.SafeArray[scala.Double],
    getDateCategories: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    setDateCategories: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XDateCategories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateCategories")(DateCategories)
    __obj.updateDynamic("getDateCategories")(getDateCategories)
    __obj.updateDynamic("setDateCategories")(setDateCategories)
    __obj.asInstanceOf[XDateCategories]
  }
}

