package typings.activexLibreoffice.com_.sun.star.chart

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes a single data row, specified by its name and a sequence of data points.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
trait ChartSeriesAddress extends StObject {
  
  /** contains the cell range address of the data for this series. */
  var DataRangeAddress: String
  
  /**
    * contains cell addresses for each domain of this series.
    *
    * For XY (scatter) diagrams at least one series has a domain. Most of the other chart types use an empty sequence here.
    */
  var DomainRangeAddresses: SafeArray[String]
  
  /** contains the cell address of label (i.e. name) of this series. */
  var LabelAddress: String
}
object ChartSeriesAddress {
  
  inline def apply(DataRangeAddress: String, DomainRangeAddresses: SafeArray[String], LabelAddress: String): ChartSeriesAddress = {
    val __obj = js.Dynamic.literal(DataRangeAddress = DataRangeAddress.asInstanceOf[js.Any], DomainRangeAddresses = DomainRangeAddresses.asInstanceOf[js.Any], LabelAddress = LabelAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesAddress] (val x: Self) extends AnyVal {
    
    inline def setDataRangeAddress(value: String): Self = StObject.set(x, "DataRangeAddress", value.asInstanceOf[js.Any])
    
    inline def setDomainRangeAddresses(value: SafeArray[String]): Self = StObject.set(x, "DomainRangeAddresses", value.asInstanceOf[js.Any])
    
    inline def setLabelAddress(value: String): Self = StObject.set(x, "LabelAddress", value.asInstanceOf[js.Any])
  }
}
