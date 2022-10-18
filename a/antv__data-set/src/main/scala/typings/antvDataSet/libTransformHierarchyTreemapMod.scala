package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.treemapBinary
import typings.antvDataSet.antvDataSetStrings.treemapDice
import typings.antvDataSet.antvDataSetStrings.treemapResquarify
import typings.antvDataSet.antvDataSetStrings.treemapSlice
import typings.antvDataSet.antvDataSetStrings.treemapSliceDice
import typings.antvDataSet.antvDataSetStrings.treemapSquarify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformHierarchyTreemapMod {
  
  trait Options extends StObject {
    
    var as: js.Tuple2[String, String]
    
    /**
      * 字段名 默认为 value
      */
    var field: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingInner: js.UndefOr[Double] = js.undefined
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingOuter: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var tile: js.UndefOr[
        treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
      ] = js.undefined
  }
  object Options {
    
    inline def apply(as: js.Tuple2[String, String]): Options = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingInner(value: Double): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingOuter(value: Double): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTile(
        value: treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
      ): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    }
  }
}
