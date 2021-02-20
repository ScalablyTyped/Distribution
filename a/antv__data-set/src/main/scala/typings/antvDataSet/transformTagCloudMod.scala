package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.archimedean
import typings.antvDataSet.antvDataSetStrings.rectangular
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformTagCloudMod {
  
  @js.native
  trait DataItem extends StObject {
    
    /** 文本内容 */
    var text: String = js.native
    
    /** 该文本所占权重 */
    var value: Double = js.native
  }
  object DataItem {
    
    @scala.inline
    def apply(text: String, value: Double): DataItem = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Options extends StObject {
    
    var fields: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var font: js.UndefOr[String | (js.Function1[/* row */ DataItem, String])] = js.native
    
    var fontSize: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
    
    var fontWeight: js.UndefOr[FontWeight | (js.Function1[/* row */ DataItem, FontWeight])] = js.native
    
    var imageMask: js.UndefOr[HTMLImageElement] = js.native
    
    var padding: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
    
    var rotate: js.UndefOr[Double | (js.Function1[/* row */ DataItem, Double])] = js.native
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var spiral: js.UndefOr[
        archimedean | rectangular | (js.Function1[
          /* size */ js.Tuple2[Double, Double], 
          js.Function1[/* t */ Double, js.Array[Double]]
        ])
      ] = js.native
    
    var timeInterval: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFont(value: String | (js.Function1[/* row */ DataItem, String])): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFunction1(value: /* row */ DataItem => String): Self = StObject.set(x, "font", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontSize(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "fontSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | (js.Function1[/* row */ DataItem, FontWeight])): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightFunction1(value: /* row */ DataItem => FontWeight): Self = StObject.set(x, "fontWeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setImageMask(value: HTMLImageElement): Self = StObject.set(x, "imageMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageMaskUndefined: Self = StObject.set(x, "imageMask", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRotate(value: Double | (js.Function1[/* row */ DataItem, Double])): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateFunction1(value: /* row */ DataItem => Double): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpiral(
        value: archimedean | rectangular | (js.Function1[
              /* size */ js.Tuple2[Double, Double], 
              js.Function1[/* t */ Double, js.Array[Double]]
            ])
      ): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpiralFunction1(value: /* size */ js.Tuple2[Double, Double] => js.Function1[/* t */ Double, js.Array[Double]]): Self = StObject.set(x, "spiral", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
      
      @scala.inline
      def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    }
  }
  
  trait _FontWeight extends StObject
}
