package typings.antvG2.libInterfaceMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterShapeFactory extends StObject {
  
  /**
    * @title 默认的 shape 类型。
    */
  val defaultShapeType: String
  
  /**
    * @title 创建具体的 G.Shape 实例。
    */
  val drawShape: js.UndefOr[
    js.Function3[/* shapeType */ String, /* cfg */ ShapeInfo, /* container */ IGroup, IShape | IGroup]
  ] = js.undefined
  
  /**
    * @title 返回绘制 shape 所有的关键点集合。
    */
  val getDefaultPoints: js.UndefOr[js.Function1[/* pointInfo */ ShapePoint, js.Array[Point]]] = js.undefined
  
  /**
    * @title 获取 shape 的默认绘制样式
    */
  val getDefaultStyle: js.UndefOr[js.Function1[/* geometryTheme */ LooseObject, LooseObject]] = js.undefined
  
  /**
    * @title 获取 shape 对应的缩略图配置。
    */
  val getMarker: js.UndefOr[
    js.Function2[/* shapeType */ String, /* markerCfg */ ShapeMarkerCfg, ShapeMarkerAttrs]
  ] = js.undefined
}
object RegisterShapeFactory {
  
  inline def apply(defaultShapeType: String): RegisterShapeFactory = {
    val __obj = js.Dynamic.literal(defaultShapeType = defaultShapeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterShapeFactory]
  }
  
  extension [Self <: RegisterShapeFactory](x: Self) {
    
    inline def setDefaultShapeType(value: String): Self = StObject.set(x, "defaultShapeType", value.asInstanceOf[js.Any])
    
    inline def setDrawShape(value: (/* shapeType */ String, /* cfg */ ShapeInfo, /* container */ IGroup) => IShape | IGroup): Self = StObject.set(x, "drawShape", js.Any.fromFunction3(value))
    
    inline def setDrawShapeUndefined: Self = StObject.set(x, "drawShape", js.undefined)
    
    inline def setGetDefaultPoints(value: /* pointInfo */ ShapePoint => js.Array[Point]): Self = StObject.set(x, "getDefaultPoints", js.Any.fromFunction1(value))
    
    inline def setGetDefaultPointsUndefined: Self = StObject.set(x, "getDefaultPoints", js.undefined)
    
    inline def setGetDefaultStyle(value: /* geometryTheme */ LooseObject => LooseObject): Self = StObject.set(x, "getDefaultStyle", js.Any.fromFunction1(value))
    
    inline def setGetDefaultStyleUndefined: Self = StObject.set(x, "getDefaultStyle", js.undefined)
    
    inline def setGetMarker(value: (/* shapeType */ String, /* markerCfg */ ShapeMarkerCfg) => ShapeMarkerAttrs): Self = StObject.set(x, "getMarker", js.Any.fromFunction2(value))
    
    inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
  }
}
