package typings.antvG2plot

import typings.antvG2plot.anon.High
import typings.antvG2plot.anon.ViolinSize
import typings.antvG2plot.libPlotsViolinTypesMod.ViolinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsViolinUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/violin/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toBoxValue(values: js.Array[Double]): High = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoxValue")(values.asInstanceOf[js.Any]).asInstanceOf[High]
  
  inline def toViolinValue(values: js.Array[Double], pdfOptions: PdfOptions): ViolinSize = (^.asInstanceOf[js.Dynamic].applyDynamic("toViolinValue")(values.asInstanceOf[js.Any], pdfOptions.asInstanceOf[js.Any])).asInstanceOf[ViolinSize]
  
  inline def transformViolinData(options: ViolinOptions): js.Array[ViolinData] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformViolinData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[ViolinData]]
  
  trait PdfOptions extends StObject {
    
    var max: Double
    
    var min: Double
    
    var size: Double
    
    var width: Double
  }
  object PdfOptions {
    
    inline def apply(max: Double, min: Double, size: Double, width: Double): PdfOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfOptions] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViolinData extends StObject {
    
    /** 最大值 */
    var high: Double
    
    /** 最小值 */
    var low: Double
    
    /** 箱线图中的中位值 */
    var median: js.Array[Double]
    
    /** 箱线图中的上线边缘线 */
    var minMax: js.Array[Double]
    
    /** 上四分位数 */
    var q1: Double
    
    /** 下四分位数 */
    var q3: Double
    
    /** 箱线图中的上下四分位点 */
    var quantile: js.Array[Double]
    
    /** 小提琴轮廓的 size 通道数据 */
    var violinSize: js.Array[Double]
    
    /** 小提琴轮廓的 y 通道数据 */
    var violinY: js.Array[Double]
    
    /** X轴 */
    var x: String
  }
  object ViolinData {
    
    inline def apply(
      high: Double,
      low: Double,
      median: js.Array[Double],
      minMax: js.Array[Double],
      q1: Double,
      q3: Double,
      quantile: js.Array[Double],
      violinSize: js.Array[Double],
      violinY: js.Array[Double],
      x: String
    ): ViolinData = {
      val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], minMax = minMax.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any], violinSize = violinSize.asInstanceOf[js.Any], violinY = violinY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViolinData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViolinData] (val x: Self) extends AnyVal {
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: js.Array[Double]): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianVarargs(value: Double*): Self = StObject.set(x, "median", js.Array(value*))
      
      inline def setMinMax(value: js.Array[Double]): Self = StObject.set(x, "minMax", value.asInstanceOf[js.Any])
      
      inline def setMinMaxVarargs(value: Double*): Self = StObject.set(x, "minMax", js.Array(value*))
      
      inline def setQ1(value: Double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ3(value: Double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQuantile(value: js.Array[Double]): Self = StObject.set(x, "quantile", value.asInstanceOf[js.Any])
      
      inline def setQuantileVarargs(value: Double*): Self = StObject.set(x, "quantile", js.Array(value*))
      
      inline def setViolinSize(value: js.Array[Double]): Self = StObject.set(x, "violinSize", value.asInstanceOf[js.Any])
      
      inline def setViolinSizeVarargs(value: Double*): Self = StObject.set(x, "violinSize", js.Array(value*))
      
      inline def setViolinY(value: js.Array[Double]): Self = StObject.set(x, "violinY", value.asInstanceOf[js.Any])
      
      inline def setViolinYVarargs(value: Double*): Self = StObject.set(x, "violinY", js.Array(value*))
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
