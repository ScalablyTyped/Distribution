package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: js.UndefOr[Point] = js.undefined
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * 半径
    * @type {number}
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * 其实角度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * 区域的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object ArcAnnotationCfg {
  
  inline def apply(container: IGroup): ArcAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcAnnotationCfg]
  }
  
  extension [Self <: ArcAnnotationCfg](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
