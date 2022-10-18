package typings.antvG2plot

import typings.antvG2plot.libPlotsVennTypesMod.VennData
import typings.antvG2plot.libPlotsVennTypesMod.VennOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot/lib/plots/venn/utils", "getColorMap")
  @js.native
  val getColorMap: ColorMapFunction = js.native
  
  inline def islegalSets(legalArr: js.Array[Any], testArr: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("islegalSets")(legalArr.asInstanceOf[js.Any], testArr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def layoutVennData(options: VennOptions, width: Double, height: Double): VennData = (^.asInstanceOf[js.Dynamic].applyDynamic("layoutVennData")(options.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[VennData]
  inline def layoutVennData(options: VennOptions, width: Double, height: Double, padding: Double): VennData = (^.asInstanceOf[js.Dynamic].applyDynamic("layoutVennData")(options.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[VennData]
  
  type ColorMapFunction = js.Function4[
    /* colorPalette */ js.Array[String], 
    /* data */ VennData, 
    /* blendMode */ js.UndefOr[String], 
    /* setsField */ String, 
    Map[String, String]
  ]
}
