package typings.antvG2plot

import typings.antvG2plot.anon.`0`
import typings.antvG2plot.antvG2plotStrings.`x-rect`
import typings.antvG2plot.antvG2plotStrings.`y-rect`
import typings.antvG2plot.antvG2plotStrings.circle
import typings.antvG2plot.antvG2plotStrings.filter
import typings.antvG2plot.antvG2plotStrings.highlight
import typings.antvG2plot.antvG2plotStrings.path
import typings.antvG2plot.antvG2plotStrings.rect
import typings.antvG2plot.libTypesButtonMod.ButtonCfg
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesInteractionMod {
  
  trait BrushCfg extends StObject {
    
    /**
      * @title brush 操作
      * @description '筛选过滤' 和 '高亮强调'. 默认: 'filter'. 目前只在 type 为 'rect' 的情况下生效
      * @default "filter"
      */
    val action: js.UndefOr[filter | highlight] = js.undefined
    
    /**
      * @title button 配置
      * @description brush button 的配置, 只在 action: 'filter' 的情况下适用
      */
    val button: js.UndefOr[ButtonCfg] = js.undefined
    
    /**
      * @title 是否启用
      * @description 是否启用 brush 交互
      */
    val enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否允许 brush 交互开始的回调
      * @description 是否允许 brush 交互开始的回调
      */
    val isStartEnable: js.UndefOr[js.Function1[/* context */ Any, Boolean]] = js.undefined
    
    /**
      * @title mask
      * @description brush mask 的配置
      */
    val mask: js.UndefOr[`0`] = js.undefined
    
    /**
      * @title brush 类型
      * @description '矩形', 'x 方向' 和 'y 方向', 'circle', 'path'(不规则矩形). 默认: 'rect'.
      * @default "rect"
      */
    val `type`: js.UndefOr[rect | `x-rect` | `y-rect` | circle | path] = js.undefined
  }
  object BrushCfg {
    
    inline def apply(): BrushCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrushCfg]
    }
    
    extension [Self <: BrushCfg](x: Self) {
      
      inline def setAction(value: filter | highlight): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setButton(value: ButtonCfg): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIsStartEnable(value: /* context */ Any => Boolean): Self = StObject.set(x, "isStartEnable", js.Any.fromFunction1(value))
      
      inline def setIsStartEnableUndefined: Self = StObject.set(x, "isStartEnable", js.undefined)
      
      inline def setMask(value: `0`): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setType(value: rect | `x-rect` | `y-rect` | circle | path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Interaction extends StObject {
    
    val cfg: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** 是否开启交互, 默认开启 */
    val enable: js.UndefOr[Boolean] = js.undefined
    
    val `type`: String
  }
  object Interaction {
    
    inline def apply(`type`: String): Interaction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interaction]
    }
    
    extension [Self <: Interaction](x: Self) {
      
      inline def setCfg(value: Record[String, Any]): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
