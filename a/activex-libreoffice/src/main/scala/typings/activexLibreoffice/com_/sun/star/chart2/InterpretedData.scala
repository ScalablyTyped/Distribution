package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait InterpretedData extends StObject {
  
  var Categories: XLabeledDataSequence
  
  var Series: SafeArray[SafeArray[XDataSeries]]
}
object InterpretedData {
  
  inline def apply(Categories: XLabeledDataSequence, Series: SafeArray[SafeArray[XDataSeries]]): InterpretedData = {
    val __obj = js.Dynamic.literal(Categories = Categories.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpretedData]
  }
  
  extension [Self <: InterpretedData](x: Self) {
    
    inline def setCategories(value: XLabeledDataSequence): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: SafeArray[SafeArray[XDataSeries]]): Self = StObject.set(x, "Series", value.asInstanceOf[js.Any])
  }
}
