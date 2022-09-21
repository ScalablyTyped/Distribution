package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetTitle extends StObject {
  
  /**
    * @title 格式化
    */
  val formatter: js.UndefOr[js.Function1[/* val */ Any, Any]] = js.undefined
  
  /**
    * @title x 方向偏移。
    */
  val offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * @title y 方向偏移。
    */
  val offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 文本样式。
    */
  val style: js.UndefOr[js.Object] = js.undefined
}
object FacetTitle {
  
  inline def apply(): FacetTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetTitle]
  }
  
  extension [Self <: FacetTitle](x: Self) {
    
    inline def setFormatter(value: /* val */ Any => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
