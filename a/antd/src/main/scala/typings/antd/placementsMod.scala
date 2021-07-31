package typings.antd

import typings.antd.anon.AdjustXAdjustY
import typings.antd.antdNumbers.`0`
import typings.antd.antdNumbers.`1`
import typings.rcTrigger.interfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placementsMod {
  
  @JSImport("antd/lib/tooltip/placements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: PlacementsConfig): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[BuildInPlacements]
  
  @scala.inline
  def getOverflowOptions(): AdjustXAdjustY = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")().asInstanceOf[AdjustXAdjustY]
  @scala.inline
  def getOverflowOptions(autoAdjustOverflow: Boolean): AdjustXAdjustY = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(autoAdjustOverflow.asInstanceOf[js.Any]).asInstanceOf[AdjustXAdjustY]
  @scala.inline
  def getOverflowOptions(autoAdjustOverflow: AdjustOverflow): AdjustXAdjustY = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(autoAdjustOverflow.asInstanceOf[js.Any]).asInstanceOf[AdjustXAdjustY]
  
  trait AdjustOverflow extends StObject {
    
    var adjustX: js.UndefOr[`0` | `1`] = js.undefined
    
    var adjustY: js.UndefOr[`0` | `1`] = js.undefined
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
  
  trait PlacementsConfig extends StObject {
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
    
    var arrowWidth: js.UndefOr[Double] = js.undefined
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
    
    var horizontalArrowShift: js.UndefOr[Double] = js.undefined
    
    var verticalArrowShift: js.UndefOr[Double] = js.undefined
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
