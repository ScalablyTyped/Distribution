package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramBinOptions extends StObject {
  
  /**
    * The options that determine the bin count of a histogram.
    */
  var BinCount: js.UndefOr[BinCountOptions] = js.undefined
  
  /**
    * The options that determine the bin width of a histogram.
    */
  var BinWidth: js.UndefOr[BinWidthOptions] = js.undefined
  
  /**
    * The options that determine the selected bin type.
    */
  var SelectedBinType: js.UndefOr[HistogramBinType] = js.undefined
  
  /**
    * The options that determine the bin start value.
    */
  var StartValue: js.UndefOr[Double] = js.undefined
}
object HistogramBinOptions {
  
  inline def apply(): HistogramBinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramBinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramBinOptions] (val x: Self) extends AnyVal {
    
    inline def setBinCount(value: BinCountOptions): Self = StObject.set(x, "BinCount", value.asInstanceOf[js.Any])
    
    inline def setBinCountUndefined: Self = StObject.set(x, "BinCount", js.undefined)
    
    inline def setBinWidth(value: BinWidthOptions): Self = StObject.set(x, "BinWidth", value.asInstanceOf[js.Any])
    
    inline def setBinWidthUndefined: Self = StObject.set(x, "BinWidth", js.undefined)
    
    inline def setSelectedBinType(value: HistogramBinType): Self = StObject.set(x, "SelectedBinType", value.asInstanceOf[js.Any])
    
    inline def setSelectedBinTypeUndefined: Self = StObject.set(x, "SelectedBinType", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "StartValue", js.undefined)
  }
}
