package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.treemapBinary
import typings.antvDataSet.antvDataSetStrings.treemapDice
import typings.antvDataSet.antvDataSetStrings.treemapResquarify
import typings.antvDataSet.antvDataSetStrings.treemapSlice
import typings.antvDataSet.antvDataSetStrings.treemapSliceDice
import typings.antvDataSet.antvDataSetStrings.treemapSquarify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treemapMod {
  
  @js.native
  trait Options extends StObject {
    
    var as: js.Tuple2[String, String] = js.native
    
    /**
      * 字段名 默认为 value
      */
    var field: js.UndefOr[String] = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var paddingBottom: js.UndefOr[Double] = js.native
    
    var paddingInner: js.UndefOr[Double] = js.native
    
    var paddingLeft: js.UndefOr[Double] = js.native
    
    var paddingOuter: js.UndefOr[Double] = js.native
    
    var paddingRight: js.UndefOr[Double] = js.native
    
    var paddingTop: js.UndefOr[Double] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var round: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var tile: js.UndefOr[
        treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(as: js.Tuple2[String, String]): Options = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingInner(value: Double): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingOuter(value: Double): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTile(
        value: treemapBinary | treemapDice | treemapSlice | treemapSliceDice | treemapSquarify | treemapResquarify
      ): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    }
  }
}
