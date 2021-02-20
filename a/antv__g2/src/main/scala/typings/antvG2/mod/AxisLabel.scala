package typings.antvG2.mod

import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 坐标轴标签
  */
@js.native
trait AxisLabel extends StObject {
  
  /**
    * 文本是否需要自动旋转，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * 用于格式化坐标轴上显示的文本信息的回调函数
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回格式化后的文本值
    */
  var formatter: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.native
  
  /**
    * 使用 html 渲染文本
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回 html 字符串
    */
  var htmlTemplate: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.native
  
  /**
    * 数值，设置坐标轴文本 label 距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * 设置文本的显示样式，还可以是个回调函数，
    * 回调函数的参数为该坐标轴对应字段的数值
    */
  var textStyle: js.UndefOr[(js.Function1[/* text */ js.UndefOr[String], text]) | text] = js.native
}
object AxisLabel {
  
  @scala.inline
  def apply(): AxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabel]
  }
  
  @scala.inline
  implicit class AxisLabelMutableBuilder[Self <: AxisLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ js.Any, /* index */ Double) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHtmlTemplate(value: (/* text */ String, /* item */ js.Any, /* index */ Double) => String): Self = StObject.set(x, "htmlTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setTextStyle(value: (js.Function1[/* text */ js.UndefOr[String], text]) | text): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleFunction1(value: /* text */ js.UndefOr[String] => text): Self = StObject.set(x, "textStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
