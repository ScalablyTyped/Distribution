package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.OmitTrendCfgdatadataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderCfg extends StObject {
  
  /**
    * @title 滑块背景样式
    */
  val backgroundStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * @title 滑块初始化的结束位置
    */
  val end: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 滑块前景样式
    */
  val foregroundStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * @title 滑块文本格式化函数
    */
  var formatter: js.UndefOr[js.Function3[/* val */ Any, /* datum */ Datum, /* idx */ Double, Any]] = js.undefined
  
  /**
    * @title 滑块两个操作块样式
    */
  val handlerStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * @title slider 高度
    */
  val height: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 允许滑动位置的最大值
    */
  val maxLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 允许滑动位置的最小值
    */
  val minLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 布局的 padding
    */
  val padding: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @title 滑块初始化的起始位置
    */
  val start: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 文本样式
    */
  val textStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * @title 滑块背景区域配置
    */
  val trendCfg: js.UndefOr[OmitTrendCfgdatadataArray] = js.undefined
}
object SliderCfg {
  
  inline def apply(): SliderCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderCfg] (val x: Self) extends AnyVal {
    
    inline def setBackgroundStyle(value: Any): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setForegroundStyle(value: Any): Self = StObject.set(x, "foregroundStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundStyleUndefined: Self = StObject.set(x, "foregroundStyle", js.undefined)
    
    inline def setFormatter(value: (/* val */ Any, /* datum */ Datum, /* idx */ Double) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHandlerStyle(value: Any): Self = StObject.set(x, "handlerStyle", value.asInstanceOf[js.Any])
    
    inline def setHandlerStyleUndefined: Self = StObject.set(x, "handlerStyle", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
    
    inline def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
    
    inline def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTextStyle(value: Any): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTrendCfg(value: OmitTrendCfgdatadataArray): Self = StObject.set(x, "trendCfg", value.asInstanceOf[js.Any])
    
    inline def setTrendCfgUndefined: Self = StObject.set(x, "trendCfg", js.undefined)
  }
}
