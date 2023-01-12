package typings.antd

import typings.antd.anon.AdjustX
import typings.antd.antdInts.`0`
import typings.antd.antdInts.`1`
import typings.rcTrigger.esInterfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPlacementsMod {
  
  @JSImport("antd/lib/_util/placements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: PlacementsConfig): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[BuildInPlacements]
  
  inline def getOverflowOptions(): AdjustX = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")().asInstanceOf[AdjustX]
  inline def getOverflowOptions(autoAdjustOverflow: Boolean): AdjustX = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(autoAdjustOverflow.asInstanceOf[js.Any]).asInstanceOf[AdjustX]
  inline def getOverflowOptions(autoAdjustOverflow: AdjustOverflow): AdjustX = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(autoAdjustOverflow.asInstanceOf[js.Any]).asInstanceOf[AdjustX]
  
  trait AdjustOverflow extends StObject {
    
    var adjustX: js.UndefOr[`0` | `1`] = js.undefined
    
    var adjustY: js.UndefOr[`0` | `1`] = js.undefined
  }
  object AdjustOverflow {
    
    inline def apply(): AdjustOverflow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustOverflow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdjustOverflow] (val x: Self) extends AnyVal {
      
      inline def setAdjustX(value: `0` | `1`): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      inline def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      inline def setAdjustY(value: `0` | `1`): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      inline def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
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
    
    inline def apply(): PlacementsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlacementsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlacementsConfig] (val x: Self) extends AnyVal {
      
      inline def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      inline def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      inline def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
      
      inline def setArrowWidthUndefined: Self = StObject.set(x, "arrowWidth", js.undefined)
      
      inline def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      inline def setHorizontalArrowShift(value: Double): Self = StObject.set(x, "horizontalArrowShift", value.asInstanceOf[js.Any])
      
      inline def setHorizontalArrowShiftUndefined: Self = StObject.set(x, "horizontalArrowShift", js.undefined)
      
      inline def setVerticalArrowShift(value: Double): Self = StObject.set(x, "verticalArrowShift", value.asInstanceOf[js.Any])
      
      inline def setVerticalArrowShiftUndefined: Self = StObject.set(x, "verticalArrowShift", js.undefined)
    }
  }
}
