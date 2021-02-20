package typings.antd

import typings.antd.anon.AdjustXAdjustY
import typings.antd.antdNumbers.`0`
import typings.antd.antdNumbers.`1`
import typings.rcTrigger.interfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placementsMod {
  
  @JSImport("antd/lib/tooltip/placements", JSImport.Default)
  @js.native
  def default(config: PlacementsConfig): BuildInPlacements = js.native
  
  @JSImport("antd/lib/tooltip/placements", "getOverflowOptions")
  @js.native
  def getOverflowOptions(): AdjustXAdjustY = js.native
  @JSImport("antd/lib/tooltip/placements", "getOverflowOptions")
  @js.native
  def getOverflowOptions(autoAdjustOverflow: Boolean): AdjustXAdjustY = js.native
  @JSImport("antd/lib/tooltip/placements", "getOverflowOptions")
  @js.native
  def getOverflowOptions(autoAdjustOverflow: AdjustOverflow): AdjustXAdjustY = js.native
  
  @js.native
  trait AdjustOverflow extends StObject {
    
    var adjustX: js.UndefOr[`0` | `1`] = js.native
    
    var adjustY: js.UndefOr[`0` | `1`] = js.native
  }
  object AdjustOverflow {
    
    @scala.inline
    def apply(): AdjustOverflow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustOverflow]
    }
    
    @scala.inline
    implicit class AdjustOverflowMutableBuilder[Self <: AdjustOverflow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: `0` | `1`): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      @scala.inline
      def setAdjustY(value: `0` | `1`): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
    }
  }
  
  @js.native
  trait PlacementsConfig extends StObject {
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
    
    var arrowWidth: js.UndefOr[Double] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var horizontalArrowShift: js.UndefOr[Double] = js.native
    
    var verticalArrowShift: js.UndefOr[Double] = js.native
  }
  object PlacementsConfig {
    
    @scala.inline
    def apply(): PlacementsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlacementsConfig]
    }
    
    @scala.inline
    implicit class PlacementsConfigMutableBuilder[Self <: PlacementsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      @scala.inline
      def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowWidthUndefined: Self = StObject.set(x, "arrowWidth", js.undefined)
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setHorizontalArrowShift(value: Double): Self = StObject.set(x, "horizontalArrowShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalArrowShiftUndefined: Self = StObject.set(x, "horizontalArrowShift", js.undefined)
      
      @scala.inline
      def setVerticalArrowShift(value: Double): Self = StObject.set(x, "verticalArrowShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalArrowShiftUndefined: Self = StObject.set(x, "verticalArrowShift", js.undefined)
    }
  }
}
