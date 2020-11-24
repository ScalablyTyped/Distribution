package typings.activexLibreoffice.com_.sun.star.chart

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes a single data row, specified by its name and a sequence of data points.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
@js.native
trait ChartSeriesAddress extends js.Object {
  
  /** contains the cell range address of the data for this series. */
  var DataRangeAddress: String = js.native
  
  /**
    * contains cell addresses for each domain of this series.
    *
    * For XY (scatter) diagrams at least one series has a domain. Most of the other chart types use an empty sequence here.
    */
  var DomainRangeAddresses: SafeArray[String] = js.native
  
  /** contains the cell address of label (i.e. name) of this series. */
  var LabelAddress: String = js.native
}
object ChartSeriesAddress {
  
  @scala.inline
  def apply(DataRangeAddress: String, DomainRangeAddresses: SafeArray[String], LabelAddress: String): ChartSeriesAddress = {
    val __obj = js.Dynamic.literal(DataRangeAddress = DataRangeAddress.asInstanceOf[js.Any], DomainRangeAddresses = DomainRangeAddresses.asInstanceOf[js.Any], LabelAddress = LabelAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesAddress]
  }
  
  @scala.inline
  implicit class ChartSeriesAddressOps[Self <: ChartSeriesAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataRangeAddress(value: String): Self = this.set("DataRangeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainRangeAddresses(value: SafeArray[String]): Self = this.set("DomainRangeAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAddress(value: String): Self = this.set("LabelAddress", value.asInstanceOf[js.Any])
  }
}
