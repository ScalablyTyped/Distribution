package typings.antvG2.mod

import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.start
import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 坐标轴线
  */
trait AxisTitle extends StObject {
  
  /**
    * 是否需要自动旋转，默认为 `true`
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 数值，设置坐标轴标题距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * 标题的显示位置（相对于坐标轴线）
    */
  var position: js.UndefOr[start | center | end] = js.undefined
  
  /**
    * 设置标题的文本样式
    */
  var textStyle: js.UndefOr[text] = js.undefined
}
object AxisTitle {
  
  @scala.inline
  def apply(): AxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTitle]
  }
  
  @scala.inline
  implicit class AxisTitleMutableBuilder[Self <: AxisTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: start | center | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTextStyle(value: text): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
