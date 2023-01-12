package typings.antvG2.libInterfaceMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterShape extends StObject {
  
  /**
    * @title 绘制函数。
    */
  def draw(cfg: ShapeInfo, container: IGroup): IShape | IGroup | Unit
  
  /**
    * @title 获取 shape 对应的缩略图样式配置，在注册具体的 shape 时由开发者自己定义。
    */
  val getMarker: js.UndefOr[js.Function1[/* markerCfg */ ShapeMarkerCfg, ShapeMarkerAttrs]] = js.undefined
  
  /**
    * @title 计算绘制需要的关键点，在注册具体的 shape 时由开发者自己定义。
    */
  val getPoints: js.UndefOr[js.Function1[/* pointInfo */ ShapePoint, js.Array[Point]]] = js.undefined
}
object RegisterShape {
  
  inline def apply(draw: (ShapeInfo, IGroup) => IShape | IGroup | Unit): RegisterShape = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw))
    __obj.asInstanceOf[RegisterShape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterShape] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: (ShapeInfo, IGroup) => IShape | IGroup | Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setGetMarker(value: /* markerCfg */ ShapeMarkerCfg => ShapeMarkerAttrs): Self = StObject.set(x, "getMarker", js.Any.fromFunction1(value))
    
    inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
    
    inline def setGetPoints(value: /* pointInfo */ ShapePoint => js.Array[Point]): Self = StObject.set(x, "getPoints", js.Any.fromFunction1(value))
    
    inline def setGetPointsUndefined: Self = StObject.set(x, "getPoints", js.undefined)
  }
}
