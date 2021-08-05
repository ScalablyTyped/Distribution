package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 画布 https://docs.alipay.com/mini/api/ui-canvas
trait ToTempFilePathOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 输出的图片宽度，默认为 width
  var destHeight: Double
  
  // 画布高度，默认为 canvas 高度 - y
  var destWidth: Double
  
  // 画布宽度，默认为 canvas 宽度 - x
  var height: Double
  
  // 画布 y 轴起点，默认为 0
  var width: Double
  
  var x: Double
  
  // 画布 x 轴起点，默认为 0
  var y: Double
}
object ToTempFilePathOptions {
  
  inline def apply(destHeight: Double, destWidth: Double, height: Double, width: Double, x: Double, y: Double): ToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFilePathOptions]
  }
  
  extension [Self <: ToTempFilePathOptions](x: Self) {
    
    inline def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    inline def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
