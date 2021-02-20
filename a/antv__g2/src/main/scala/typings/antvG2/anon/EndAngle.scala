package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndAngle extends StObject {
  
  /**
    * 极坐标的结束角度，单位为弧度
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * 空心圆的半径，值范围为 0 至 1
    */
  var innerRadius: js.UndefOr[Double] = js.native
  
  /**
    * 设置半径，值范围为 0 至 1
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * 极坐标的起始角度，单位为弧度
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object EndAngle {
  
  @scala.inline
  def apply(): EndAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAngle]
  }
  
  @scala.inline
  implicit class EndAngleMutableBuilder[Self <: EndAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
