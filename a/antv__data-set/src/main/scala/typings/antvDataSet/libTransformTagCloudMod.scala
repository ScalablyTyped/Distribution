package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.archimedean
import typings.antvDataSet.antvDataSetStrings.rectangular
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformTagCloudMod {
  
  trait DataItem extends StObject {
    
    /** 文本内容 */
    var text: String
    
    /** 该文本所占权重 */
    var value: Double
  }
  object DataItem {
    
    inline def apply(text: String, value: Double): DataItem = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataItem]
    }
    
    extension [Self <: DataItem](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.antvDataSet.antvDataSetStrings.normal
    - typings.antvDataSet.antvDataSetStrings.bold
    - typings.antvDataSet.antvDataSetStrings.bolder
    - typings.antvDataSet.antvDataSetStrings.lighter
  */
  type FontWeight = _FontWeight | Double
  
  trait Options extends StObject {
    
    var fields: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var font: js.UndefOr[String | (js.Function1[/* row */ DataItem, String])] = js.undefined
    
    var fontSize: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.undefined
    
    var fontWeight: js.UndefOr[FontWeight | (js.Function1[/* row */ DataItem, FontWeight])] = js.undefined
    
    var imageMask: js.UndefOr[HTMLImageElement] = js.undefined
    
    var padding: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.undefined
    
    var rotate: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.undefined
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var spiral: js.UndefOr[
        archimedean | rectangular | (js.Function1[
          /* size */ js.Tuple2[Double, Double], 
          js.Function1[/* t */ Double, js.Array[Double]]
        ])
      ] = js.undefined
    
    var timeInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFont(value: String | (js.Function1[/* row */ DataItem, String])): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFunction1(value: /* row */ DataItem => String): Self = StObject.set(x, "font", js.Any.fromFunction1(value))
      
      inline def setFontSize(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "fontSize", js.Any.fromFunction1(value))
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: FontWeight | (js.Function1[/* row */ DataItem, FontWeight])): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightFunction1(value: /* row */ DataItem => FontWeight): Self = StObject.set(x, "fontWeight", js.Any.fromFunction1(value))
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setImageMask(value: HTMLImageElement): Self = StObject.set(x, "imageMask", value.asInstanceOf[js.Any])
      
      inline def setImageMaskUndefined: Self = StObject.set(x, "imageMask", js.undefined)
      
      inline def setPadding(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRotate(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpiral(
        value: archimedean | rectangular | (js.Function1[
              /* size */ js.Tuple2[Double, Double], 
              js.Function1[/* t */ Double, js.Array[Double]]
            ])
      ): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
      
      inline def setSpiralFunction1(value: /* size */ js.Tuple2[Double, Double] => js.Function1[/* t */ Double, js.Array[Double]]): Self = StObject.set(x, "spiral", js.Any.fromFunction1(value))
      
      inline def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
      
      inline def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    }
  }
  
  trait _FontWeight extends StObject
}
