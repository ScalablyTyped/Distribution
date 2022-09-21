package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDatum extends StObject {
  
  /**
    * @title 原始数据
    */
  var _origin: Datum
  
  /**
    * @title 颜色
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @title 相对于当前 shape 的下一个 shape 的关键点信息
    */
  var nextPoints: js.UndefOr[ShapeVertices] = js.undefined
  
  /**
    * @title shape 的关键点信息
    */
  var points: js.UndefOr[ShapeVertices] = js.undefined
  
  /**
    * @title 渲染的 shape 类型
    */
  var shape: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @title 大小
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @title x 轴的坐标
    */
  var x: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  /**
    * @title y 轴的坐标
    */
  var y: js.UndefOr[js.Array[Double] | Double] = js.undefined
}
object MappingDatum {
  
  inline def apply(_origin: Datum): MappingDatum = {
    val __obj = js.Dynamic.literal(_origin = _origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDatum]
  }
  
  extension [Self <: MappingDatum](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setNextPoints(value: ShapeVertices): Self = StObject.set(x, "nextPoints", value.asInstanceOf[js.Any])
    
    inline def setNextPointsUndefined: Self = StObject.set(x, "nextPoints", js.undefined)
    
    inline def setNextPointsVarargs(value: (js.Array[Point] | Point | RangePoint)*): Self = StObject.set(x, "nextPoints", js.Array(value*))
    
    inline def setPoints(value: ShapeVertices): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: (js.Array[Point] | Point | RangePoint)*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setShape(value: String | js.Array[String]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setX(value: js.Array[Double] | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: js.Array[Double] | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    
    inline def set_origin(value: Datum): Self = StObject.set(x, "_origin", value.asInstanceOf[js.Any])
  }
}
