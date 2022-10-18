package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.GridLineCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisGridCfg extends StObject {
  
  /**
    * @title 是否同刻度线对齐
    * @description 如果值为 false，则会显示在两个刻度中间。
    * @see ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*YX6fS4GTTvMAAAAAAAAAAABkARQnAQ)
    */
  var alignTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 两个栅格线间的填充色。
    */
  var alternateColor: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @title 是否关闭
    * @description 对于 circle 是否关闭 grid。
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 线的样式
    * @description
    * 属性结构如下：
    *
    * ```ts
    * {
    *   type?: string; // 栅格线的类型，'line' 或者 'circle'
    *   style?: ShapeAttrs; // 栅格线的样式配置项
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L407|GridLineCfg
    */
  var line: js.UndefOr[GridLineCfg] = js.undefined
}
object AxisGridCfg {
  
  inline def apply(): AxisGridCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGridCfg]
  }
  
  extension [Self <: AxisGridCfg](x: Self) {
    
    inline def setAlignTick(value: Boolean): Self = StObject.set(x, "alignTick", value.asInstanceOf[js.Any])
    
    inline def setAlignTickUndefined: Self = StObject.set(x, "alignTick", js.undefined)
    
    inline def setAlternateColor(value: String | js.Array[String]): Self = StObject.set(x, "alternateColor", value.asInstanceOf[js.Any])
    
    inline def setAlternateColorUndefined: Self = StObject.set(x, "alternateColor", js.undefined)
    
    inline def setAlternateColorVarargs(value: String*): Self = StObject.set(x, "alternateColor", js.Array(value*))
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setLine(value: GridLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
