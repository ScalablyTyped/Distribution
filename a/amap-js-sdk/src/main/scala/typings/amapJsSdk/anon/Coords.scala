package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  /**
    *
    * 可点击区域组成元素数组，存放图形的像素坐标等信息，该数组元素由type决定：
    * - circle:coords格式为 [x1, y1, r]，x1，y1为圆心像素坐标，r为圆半径
    * - poly: coords格式为 [x1, y1, x2, y2 … xn, yn]，各x，y表示多边形边界像素坐标
    * - rect: coords格式为 [x1, y1, x2, y2]，x1，y1为矩形左上角像素坐标，x2，y2为矩形右下角像素坐标
    * Markshape的像素坐标是指相对于marker的左上角的像素坐标偏移量
    */
  var coords: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * 可点击区域类型，可选值：
    * - circle:圆形
    * - poly:多边形
    * - rect:矩形
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Coords {
  
  @scala.inline
  def apply(): Coords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coords]
  }
  
  @scala.inline
  implicit class CoordsMutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    @scala.inline
    def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
