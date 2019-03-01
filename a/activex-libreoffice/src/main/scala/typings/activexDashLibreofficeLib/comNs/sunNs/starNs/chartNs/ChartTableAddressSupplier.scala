package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a helper service for access to table Address to cell ranges of the container document of a chart.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
trait ChartTableAddressSupplier extends js.Object {
  /**
    * contains the address to the cells containing the names of the categories.
    *
    * Note: Each value of a data series belongs exactly to one category.
    */
  var CategoriesRangeAddress: java.lang.String
  /** contains the address to the main title. */
  var MainTitleAddress: java.lang.String
  /**
    * contains the addresses to the elements of a series. This sequence should contain one element for each series in the chart.
    * @see ChartSeriesAddress
    */
  var SeriesAddresses: activexDashInteropLib.SafeArray[ChartSeriesAddress]
  /** contains the address to the sub title. */
  var SubTitleAddress: java.lang.String
}

object ChartTableAddressSupplier {
  @scala.inline
  def apply(
    CategoriesRangeAddress: java.lang.String,
    MainTitleAddress: java.lang.String,
    SeriesAddresses: activexDashInteropLib.SafeArray[ChartSeriesAddress],
    SubTitleAddress: java.lang.String
  ): ChartTableAddressSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CategoriesRangeAddress")(CategoriesRangeAddress)
    __obj.updateDynamic("MainTitleAddress")(MainTitleAddress)
    __obj.updateDynamic("SeriesAddresses")(SeriesAddresses)
    __obj.updateDynamic("SubTitleAddress")(SubTitleAddress)
    __obj.asInstanceOf[ChartTableAddressSupplier]
  }
}

