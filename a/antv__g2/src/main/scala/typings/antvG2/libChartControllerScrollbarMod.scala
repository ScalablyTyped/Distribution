package typings.antvG2

import typings.antvG2.libChartControllerBaseMod.Controller
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.ScrollbarOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerScrollbarMod {
  
  @JSImport("@antv/g2/lib/chart/controller/scrollbar", JSImport.Default)
  @js.native
  open class default protected () extends Scrollbar {
    def this(view: View) = this()
  }
  
  @js.native
  trait Scrollbar extends Controller[ScrollbarOption] {
    
    /* private */ var changeViewData: Any = js.native
    
    /* private */ var cnt: Any = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var createScrollbar: Any = js.native
    
    /* private */ var data: Any = js.native
    
    /* private */ var getCnt: Any = js.native
    
    /* private */ var getScrollRange: Any = js.native
    
    /* private */ var getScrollbarComponentCfg: Any = js.native
    
    /**
      * 获取数据
      */
    /* private */ var getScrollbarData: Any = js.native
    
    /**
      * 获取 scrollbar 组件的主题样式
      */
    /* private */ var getScrollbarTheme: Any = js.native
    
    /* private */ var getStep: Any = js.native
    
    /**
      * 获取 scrollbar 的主题配置
      */
    /* private */ var getThemeOptions: Any = js.native
    
    /**
      * 填充一些默认的配置项目
      */
    /* private */ var getValidScrollbarCfg: Any = js.native
    
    /** 获得滚动条位置  */
    def getValue(): Double = js.native
    
    /* private */ var measureScrollbar: Any = js.native
    
    /* private */ var onChangeFn: Any = js.native
    
    /* private */ var onValueChange: Any = js.native
    
    /* private */ var ratio: Any = js.native
    
    /* private */ var resetMeasure: Any = js.native
    
    /* private */ var scrollbar: Any = js.native
    
    /** 设置滚动条位置  */
    def setValue(ratio: Double): Unit = js.native
    
    /* private */ var step: Any = js.native
    
    /* private */ var thumbLen: Any = js.native
    
    /* private */ var trackLen: Any = js.native
    
    /* private */ var updateScrollbar: Any = js.native
    
    /* private */ var xScaleCfg: Any = js.native
    
    /* private */ var yScalesCfg: Any = js.native
  }
}
