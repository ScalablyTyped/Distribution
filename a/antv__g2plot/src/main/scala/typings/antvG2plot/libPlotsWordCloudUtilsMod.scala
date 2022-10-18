package typings.antvG2plot

import typings.antvG2plot.anon.AppendPadding
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsWordCloudTypesMod.Tag
import typings.antvG2plot.libPlotsWordCloudTypesMod.Word
import typings.antvG2plot.libPlotsWordCloudTypesMod.WordCloudOptions
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWordCloudUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/word-cloud/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFontSizeMapping(): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")().asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(
    fontSize: js.Function3[
      /* word */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      Double
    ]
  ): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(
    fontSize: js.Function3[
      /* word */ Word, 
      /* index */ js.UndefOr[Double], 
      /* words */ js.UndefOr[js.Array[Word]], 
      Double
    ],
    range: js.Tuple2[Double, Double]
  ): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(fontSize: js.Tuple2[Double, Double]): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(fontSize: js.Tuple2[Double, Double], range: js.Tuple2[Double, Double]): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(fontSize: Double): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(fontSize: Double, range: js.Tuple2[Double, Double]): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  inline def getFontSizeMapping(fontSize: Unit, range: js.Tuple2[Double, Double]): js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeMapping")(fontSize.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* word */ Word, 
    /* index */ js.UndefOr[Double], 
    /* words */ js.UndefOr[js.Array[Word]], 
    Double
  ]]
  
  inline def getSingleKeyValues(data: js.Array[Datum], key: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingleKeyValues")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getSize(options: AppendPadding): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def processImageMask(img: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("processImageMask")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  inline def processImageMask(img: HTMLImageElement): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("processImageMask")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  
  inline def transform(params: Params[WordCloudOptions]): js.Array[Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tag]]
}
