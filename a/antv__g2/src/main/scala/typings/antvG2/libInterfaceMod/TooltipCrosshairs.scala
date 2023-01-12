package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.CrosshairLineCfg
import typings.antvComponent.libTypesMod.CrosshairTextBackgroundCfg
import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.xy
import typings.antvG2.antvG2Strings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipCrosshairs extends StObject {
  
  /**
    * @title 辅助线是否跟随鼠标移动
    * @description 即定位到数据点
    * @default false
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 辅助线的样式配置。
    * @description
    * 属性结构如下：
    *
    * ```ts
    * {
    *   style?: ShapeAttrs; // 线的样式配置
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L1177|CrosshairLineCfg
    */
  var line: js.UndefOr[CrosshairLineCfg] = js.undefined
  
  /**
    * @title 文本
    * @description 辅助线文本配置，支持回调。
    */
  var text: js.UndefOr[TooltipCrosshairsText | TooltipCrosshairsTextCallback] = js.undefined
  
  /**
    * @title 辅助线文本背景配置。
    * @description
    * 属性结构如下：
    *
    * ```ts
    * {
    *   padding?: number | number[]; // 文本背景周围的留白
    *   style?: ShapeAttrs; // 文本背景的样式
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L1185|CrosshairTextBackgroundCfg
    */
  var textBackground: js.UndefOr[CrosshairTextBackgroundCfg] = js.undefined
  
  /**
    * @title 类型
    * @description
    * crosshairs 的类型: `x` 表示 x 轴上的辅助线，`y` 表示 y 轴上的辅助项。
    * 以下是在不同坐标系下，crosshairs 各个类型的表现：
    *
    * | 坐标系 | type = 'x' | type = 'xy' | type = 'y' |
    * | ------------ | ------------- | ------------- |
    * | 直角坐标系  | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*jmUBQ4nbtXsAAAAAAAAAAABkARQnAQ) | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*RpWXT76ZSQgAAAAAAAAAAABkARQnAQ) | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*Xjl8TLIJLuUAAAAAAAAAAABkARQnAQ) |
    * | 极坐标 | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*zbMVSoKTyFsAAAAAAAAAAABkARQnAQ) | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*k5EYRJspET0AAAAAAAAAAABkARQnAQ) | ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*n_TKQpUaXWEAAAAAAAAAAABkARQnAQ) |
    */
  var `type`: js.UndefOr[x | y | xy] = js.undefined
}
object TooltipCrosshairs {
  
  inline def apply(): TooltipCrosshairs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipCrosshairs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipCrosshairs] (val x: Self) extends AnyVal {
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setLine(value: CrosshairLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setText(value: TooltipCrosshairsText | TooltipCrosshairsTextCallback): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextBackground(value: CrosshairTextBackgroundCfg): Self = StObject.set(x, "textBackground", value.asInstanceOf[js.Any])
    
    inline def setTextBackgroundUndefined: Self = StObject.set(x, "textBackground", js.undefined)
    
    inline def setTextFunction4(
      value: (/* type */ String, /* defaultContent */ Any, /* items */ js.Array[Any], /* currentPoint */ Point) => TooltipCrosshairsText
    ): Self = StObject.set(x, "text", js.Any.fromFunction4(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: typings.antvG2.antvG2Strings.x | y | xy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
