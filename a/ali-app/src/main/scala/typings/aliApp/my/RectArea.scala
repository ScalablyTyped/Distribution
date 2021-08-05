package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 节点查询 https://docs.alipay.com/mini/api/selector-query
trait RectArea extends StObject {
  
  /** 节点的下边界坐标 */
  var bottom: Double
  
  /** 节点的高度 */
  var height: Double
  
  /** 节点的左边界坐标 */
  var left: Double
  
  /** 节点的右边界坐标 */
  var right: Double
  
  /** 节点的上边界坐标 */
  var top: Double
  
  /** 节点的宽度 */
  var width: Double
}
object RectArea {
  
  inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): RectArea = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectArea]
  }
  
  extension [Self <: RectArea](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
