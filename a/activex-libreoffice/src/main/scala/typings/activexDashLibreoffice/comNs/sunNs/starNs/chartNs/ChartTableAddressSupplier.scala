package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.std.SafeArray
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
  var CategoriesRangeAddress: String
  /** contains the address to the main title. */
  var MainTitleAddress: String
  /**
    * contains the addresses to the elements of a series. This sequence should contain one element for each series in the chart.
    * @see ChartSeriesAddress
    */
  var SeriesAddresses: SafeArray[ChartSeriesAddress]
  /** contains the address to the sub title. */
  var SubTitleAddress: String
}

object ChartTableAddressSupplier {
  @scala.inline
  def apply(
    CategoriesRangeAddress: String,
    MainTitleAddress: String,
    SeriesAddresses: SafeArray[ChartSeriesAddress],
    SubTitleAddress: String
  ): ChartTableAddressSupplier = {
    val __obj = js.Dynamic.literal(CategoriesRangeAddress = CategoriesRangeAddress, MainTitleAddress = MainTitleAddress, SeriesAddresses = SeriesAddresses, SubTitleAddress = SubTitleAddress)
  
    __obj.asInstanceOf[ChartTableAddressSupplier]
  }
}

