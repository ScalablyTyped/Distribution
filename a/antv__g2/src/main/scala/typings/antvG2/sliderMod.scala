package typings.antvG2

import typings.antvG2.controllerBaseMod.Controller
import typings.antvG2.libInterfaceMod.SliderOption
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("@antv/g2/lib/chart/controller/slider", JSImport.Default)
  @js.native
  open class default protected () extends Slider {
    def this(view: View) = this()
  }
  
  @js.native
  trait Slider extends Controller[SliderOption] {
    
    /**
      * 更新 view 过滤数据
      * @param min
      * @param max
      */
    /* private */ var changeViewData: Any = js.native
    
    /* private */ var container: Any = js.native
    
    /**
      * 创建 slider 组件
      */
    /* private */ var createSlider: Any = js.native
    
    /* private */ var end: Any = js.native
    
    /**
      * 从 view 中获取数据，缩略轴使用全量的数据
      */
    /* private */ var getData: Any = js.native
    
    /**
      * 根据 start/end 和当前数据计算出当前的 minText/maxText
      * @param min
      * @param max
      */
    /* private */ var getMinMaxText: Any = js.native
    
    /**
      * 生成 slider 配置
      */
    /* private */ var getSliderCfg: Any = js.native
    
    /**
      * 获取 slider 的主题配置
      */
    /* private */ var getThemeOptions: Any = js.native
    
    /**
      * 进行测量操作
      */
    /* private */ var measureSlider: Any = js.native
    
    /* private */ var onChangeFn: Any = js.native
    
    /**
      * 滑块滑动的时候出发
      * @param v
      */
    /* private */ var onValueChange: Any = js.native
    
    /**
      * 清除测量
      */
    /* private */ var resetMeasure: Any = js.native
    
    /* private */ var slider: Any = js.native
    
    /* private */ var start: Any = js.native
    
    /**
      * 更新配置
      */
    /* private */ var updateSlider: Any = js.native
    
    /* private */ var width: Any = js.native
  }
}
