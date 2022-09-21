package typings.antvG2plot

import typings.antvG2plot.anon.PartialOptions
import typings.antvG2plot.antvG2plotStrings.archimedean
import typings.antvG2plot.antvG2plotStrings.rectangular
import typings.antvG2plot.wordCloudTypesMod.Tag
import typings.antvG2plot.wordCloudTypesMod.Word
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformWordCloudMod {
  
  @JSImport("@antv/g2plot/lib/utils/transform/word-cloud", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def functor(d: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functor")(d.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def transform(words: js.Array[Word], options: Options): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(words.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def wordCloud(words: js.Array[Word]): js.Array[Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordCloud")(words.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tag]]
  inline def wordCloud(words: js.Array[Word], options: PartialOptions): js.Array[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("wordCloud")(words.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tag]]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.antvG2plot.antvG2plotStrings.normal
    - typings.antvG2plot.antvG2plotStrings.bold
    - typings.antvG2plot.antvG2plotStrings.bolder
    - typings.antvG2plot.antvG2plotStrings.lighter
  */
  type FontWeight = _FontWeight | Double
  
  trait Options extends StObject {
    
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
        FontWeight | (js.Function3[
          /* row */ Word, 
          /* index */ js.UndefOr[Double], 
          /* words */ js.UndefOr[js.Array[Word]], 
          FontWeight
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
    
    var size: js.Tuple2[Double, Double]
    
    var spiral: js.UndefOr[
        archimedean | rectangular | (js.Function1[
          /* size */ js.Tuple2[Double, Double], 
          js.Function1[/* t */ Double, js.Array[Double]]
        ])
      ] = js.undefined
    
    var timeInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(size: js.Tuple2[Double, Double]): Options = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
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
        value: FontWeight | (js.Function3[
              /* row */ Word, 
              /* index */ js.UndefOr[Double], 
              /* words */ js.UndefOr[js.Array[Word]], 
              FontWeight
            ])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightFunction3(
        value: (/* row */ Word, /* index */ js.UndefOr[Double], /* words */ js.UndefOr[js.Array[Word]]) => FontWeight
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
