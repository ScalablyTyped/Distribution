package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.ConnectNulls
import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.antvG2Strings.area
import typings.antvG2.antvG2Strings.edge
import typings.antvG2.antvG2Strings.heatmap
import typings.antvG2.antvG2Strings.interval
import typings.antvG2.antvG2Strings.line
import typings.antvG2.antvG2Strings.path
import typings.antvG2.antvG2Strings.point
import typings.antvG2.antvG2Strings.polygon
import typings.antvG2.antvG2Strings.schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryOption extends StObject {
  
  /**
    * @title adjust 数据调整方式，对应 `geometry.adjust()`。
    */
  var adjust: js.UndefOr[String | (js.Array[AdjustOption | String]) | AdjustOption] = js.undefined
  
  /**
    * @title Geometry 动画配置，对应 `geometry.animate()`。
    */
  var animate: js.UndefOr[AnimateOption | Boolean] = js.undefined
  
  /**
    * @title 其他配置
    */
  var cfg: js.UndefOr[ConnectNulls] = js.undefined
  
  /**
    * @title color 通道映射规则，对应 `geometry.color()`。
    */
  var color: js.UndefOr[String | AttributeOption] = js.undefined
  
  /**
    * @title Label 配置，对应 `geometry.label()`。
    */
  var label: js.UndefOr[LabelOption | `false` | String] = js.undefined
  
  /**
    * @title position 通道映射规则，对应 `geometry.position()`。
    */
  var position: js.UndefOr[String | AttributeOption] = js.undefined
  
  /**
    * @title shape 通道映射规则，对应 `geometry.shape()`。
    */
  var shape: js.UndefOr[String | AttributeOption] = js.undefined
  
  /**
    * @title size 通道映射规则，对应 `geometry.size()`。
    */
  var size: js.UndefOr[Double | String | AttributeOption] = js.undefined
  
  /**
    * @title state 样式配置，对应 `geometry.state()`。
    */
  var state: js.UndefOr[StateOption] = js.undefined
  
  /**
    * @title style 样式配置，对应 `geometry.size()`。
    */
  var style: js.UndefOr[StyleOption | LooseObject] = js.undefined
  
  /**
    * @title tooltip 配置，对应 `geometry.tooltip()`。
    */
  var tooltip: js.UndefOr[GeometryTooltipOption | Boolean | String] = js.undefined
  
  /**
    * @title Geometry 的类型。
    */
  var `type`: js.UndefOr[
    interval | line | path | point | area | polygon | schema | edge | heatmap | String
  ] = js.undefined
}
object GeometryOption {
  
  inline def apply(): GeometryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryOption]
  }
  
  extension [Self <: GeometryOption](x: Self) {
    
    inline def setAdjust(value: String | (js.Array[AdjustOption | String]) | AdjustOption): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
    
    inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    inline def setAdjustVarargs(value: (AdjustOption | String)*): Self = StObject.set(x, "adjust", js.Array(value*))
    
    inline def setAnimate(value: AnimateOption | Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCfg(value: ConnectNulls): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setColor(value: String | AttributeOption): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLabel(value: LabelOption | `false` | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPosition(value: String | AttributeOption): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShape(value: String | AttributeOption): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double | String | AttributeOption): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setState(value: StateOption): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStyle(value: StyleOption | LooseObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTooltip(value: GeometryTooltipOption | Boolean | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: interval | line | path | point | area | polygon | schema | edge | heatmap | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
