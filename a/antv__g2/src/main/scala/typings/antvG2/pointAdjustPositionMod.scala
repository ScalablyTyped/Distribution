package typings.antvG2

import typings.antvG2.labelInterfaceMod.LabelItem
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointAdjustPositionMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/point/adjust-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointAdjustPosition(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox,
    cfg: PointAdjustPositionLayoutCfg
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAdjustPosition")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PointAdjustPositionLayoutCfg extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object PointAdjustPositionLayoutCfg {
    
    inline def apply(): PointAdjustPositionLayoutCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointAdjustPositionLayoutCfg]
    }
    
    extension [Self <: PointAdjustPositionLayoutCfg](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
