package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.archimedean
import typings.antvG2plot.antvG2plotStrings.rectangular
import typings.antvG2plot.libPlotsWordCloudTypesMod.Word
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/utils/transform/word-cloud.Options> */
trait PartialOptions extends StObject {
  
  var font: js.UndefOr[
    String | (js.Function3[
      /* row */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      String
    ])
  ] = js.undefined
  
  var fontSize: js.UndefOr[
    Double | (js.Function3[
      /* row */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      Double
    ])
  ] = js.undefined
  
  var fontWeight: js.UndefOr[
    typings.antvG2plot.libUtilsTransformWordCloudMod.FontWeight | (js.Function3[
      /* row */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      typings.antvG2plot.libUtilsTransformWordCloudMod.FontWeight
    ])
  ] = js.undefined
  
  var imageMask: js.UndefOr[HTMLImageElement] = js.undefined
  
  var padding: js.UndefOr[
    Double | (js.Function3[
      /* row */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      Double
    ])
  ] = js.undefined
  
  var random: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  
  var rotate: js.UndefOr[
    Double | (js.Function3[
      /* row */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      Double
    ])
  ] = js.undefined
  
  var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var spiral: js.UndefOr[
    archimedean | rectangular | (js.Function1[
      /* size */ js.Tuple2[Double, Double], 
      js.Function1[/* t */ Double, js.Array[Double]]
    ])
  ] = js.undefined
  
  var timeInterval: js.UndefOr[Double] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    inline def setFont(
      value: String | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          String
        ])
    ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction3(
      value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => String
    ): Self = StObject.set(x, "font", js.Any.fromFunction3(value))
    
    inline def setFontSize(
      value: Double | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeFunction3(
      value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
    ): Self = StObject.set(x, "fontSize", js.Any.fromFunction3(value))
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontWeight(
      value: typings.antvG2plot.libUtilsTransformWordCloudMod.FontWeight | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          typings.antvG2plot.libUtilsTransformWordCloudMod.FontWeight
        ])
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightFunction3(
      value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => typings.antvG2plot.libUtilsTransformWordCloudMod.FontWeight
    ): Self = StObject.set(x, "fontWeight", js.Any.fromFunction3(value))
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setImageMask(value: HTMLImageElement): Self = StObject.set(x, "imageMask", value.asInstanceOf[js.Any])
    
    inline def setImageMaskUndefined: Self = StObject.set(x, "imageMask", js.undefined)
    
    inline def setPadding(
      value: Double | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction3(
      value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
    ): Self = StObject.set(x, "padding", js.Any.fromFunction3(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRandom(value: Double | js.Function0[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomFunction0(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setRotate(
      value: Double | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          Double
        ])
    ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateFunction3(
      value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => Double
    ): Self = StObject.set(x, "rotate", js.Any.fromFunction3(value))
    
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
