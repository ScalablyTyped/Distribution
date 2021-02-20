package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
@js.native
trait InterpretedData extends StObject {
  
  var Categories: XLabeledDataSequence = js.native
  
  var Series: SafeArray[SafeArray[XDataSeries]] = js.native
}
object InterpretedData {
  
  @scala.inline
  def apply(Categories: XLabeledDataSequence, Series: SafeArray[SafeArray[XDataSeries]]): InterpretedData = {
    val __obj = js.Dynamic.literal(Categories = Categories.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpretedData]
  }
  
  @scala.inline
  implicit class InterpretedDataMutableBuilder[Self <: InterpretedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: XLabeledDataSequence): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: SafeArray[SafeArray[XDataSeries]]): Self = StObject.set(x, "Series", value.asInstanceOf[js.Any])
  }
}
