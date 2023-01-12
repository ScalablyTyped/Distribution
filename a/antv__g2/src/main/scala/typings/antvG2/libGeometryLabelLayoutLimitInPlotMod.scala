package typings.antvG2

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.ellipsis
import typings.antvG2.antvG2Strings.hide
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.antvG2Strings.translate
import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelLayoutLimitInPlotMod {
  
  @JSImport("@antv/g2/lib/geometry/label/layout/limit-in-plot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def limitInPlot(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("limitInPlot")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def limitInPlot(
    items: js.Array[LabelItem],
    labels: js.Array[IGroup],
    shapes: js.Array[IGroup | IShape],
    region: BBox,
    cfg: LimitInPlotLayoutCfg
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("limitInPlot")(items.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], region.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LimitInPlotLayoutCfg extends StObject {
    
    /** 超过限制后的动作，默认 translate 移动位置; ellipsis 对 text 进行省略展示 */
    var action: js.UndefOr[hide | translate | ellipsis] = js.undefined
    
    /** 需要限制哪些方向上不能超过 Plot 范围，默认四个方向上都限制 */
    var direction: js.UndefOr[js.Array[top | right | bottom | left]] = js.undefined
    
    /** 可以允许的 margin */
    var margin: js.UndefOr[Double] = js.undefined
  }
  object LimitInPlotLayoutCfg {
    
    inline def apply(): LimitInPlotLayoutCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitInPlotLayoutCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LimitInPlotLayoutCfg] (val x: Self) extends AnyVal {
      
      inline def setAction(value: hide | translate | ellipsis): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setDirection(value: js.Array[top | right | bottom | left]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDirectionVarargs(value: (top | right | bottom | left)*): Self = StObject.set(x, "direction", js.Array(value*))
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
}
