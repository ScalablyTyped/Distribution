package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeInfo extends StObject {
  
  /**
    * @title shape 背景，只对 Interval Geometry 生效，目前只对 interval-rect shape 生效。
    */
  var background: js.UndefOr[Style] = js.undefined
  
  /**
    * @title 映射的颜色值
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @title 是否连接空值，只对 Path Line Area 这三种 Geometry 生效。
    */
  var connectNulls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 自定义的数据，传入到 shapeInfo 中
    */
  var customInfo: js.UndefOr[CustomOption] = js.undefined
  
  /**
    * @title 对应的原始数据记录
    */
  var data: js.UndefOr[Datum | Data] = js.undefined
  
  /**
    * @title 默认的 shape 样式
    */
  var defaultStyle: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title 是否在极坐标下
    */
  var isInCircle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 数据是否发生层叠
    */
  var isStack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 存储进行图形映射后的数据
    */
  var mappingData: js.UndefOr[MappingDatum | js.Array[MappingDatum]] = js.undefined
  
  /**
    * @title 下一个数据集对应的关键点
    */
  var nextPoints: js.UndefOr[ShapeVertices] = js.undefined
  
  /**
    * @title 构成 shape 的关键点
    */
  var points: js.UndefOr[ShapeVertices] = js.undefined
  
  /**
    * @title 映射的 shape 类型
    */
  var shape: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @title 是否展示单个孤立的数据点，只对 Path Line Area 这三种 Geometry 生效。
    */
  var showSinglePoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title size 映射值
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 用户设置的图形样式
    */
  var style: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title Geometry.Text 需要
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @title x 坐标
    */
  var x: Double | js.Array[Double]
  
  /**
    * @title y 坐标
    */
  var y: Double | js.Array[Double]
}
object ShapeInfo {
  
  inline def apply(x: Double | js.Array[Double], y: Double | js.Array[Double]): ShapeInfo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeInfo] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Style): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
    
    inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
    
    inline def setCustomInfo(value: CustomOption): Self = StObject.set(x, "customInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomInfoUndefined: Self = StObject.set(x, "customInfo", js.undefined)
    
    inline def setData(value: Datum | Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefaultStyle(value: LooseObject): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    inline def setIsInCircle(value: Boolean): Self = StObject.set(x, "isInCircle", value.asInstanceOf[js.Any])
    
    inline def setIsInCircleUndefined: Self = StObject.set(x, "isInCircle", js.undefined)
    
    inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
    
    inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
    
    inline def setMappingData(value: MappingDatum | js.Array[MappingDatum]): Self = StObject.set(x, "mappingData", value.asInstanceOf[js.Any])
    
    inline def setMappingDataUndefined: Self = StObject.set(x, "mappingData", js.undefined)
    
    inline def setMappingDataVarargs(value: MappingDatum*): Self = StObject.set(x, "mappingData", js.Array(value*))
    
    inline def setNextPoints(value: ShapeVertices): Self = StObject.set(x, "nextPoints", value.asInstanceOf[js.Any])
    
    inline def setNextPointsUndefined: Self = StObject.set(x, "nextPoints", js.undefined)
    
    inline def setNextPointsVarargs(value: (js.Array[Point] | Point | RangePoint)*): Self = StObject.set(x, "nextPoints", js.Array(value*))
    
    inline def setPoints(value: ShapeVertices): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: (js.Array[Point] | Point | RangePoint)*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setShape(value: String | js.Array[String]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setShowSinglePoint(value: Boolean): Self = StObject.set(x, "showSinglePoint", value.asInstanceOf[js.Any])
    
    inline def setShowSinglePointUndefined: Self = StObject.set(x, "showSinglePoint", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: LooseObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setX(value: Double | js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
