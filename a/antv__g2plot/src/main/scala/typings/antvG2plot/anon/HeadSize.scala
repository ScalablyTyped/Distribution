package typings.antvG2plot.anon

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadSize extends StObject {
  
  /** 箭头宽度 */
  var headSize: js.UndefOr[Double] = js.undefined
  
  /** 箭头样式 */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object HeadSize {
  
  inline def apply(): HeadSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadSize] (val x: Self) extends AnyVal {
    
    inline def setHeadSize(value: Double): Self = StObject.set(x, "headSize", value.asInstanceOf[js.Any])
    
    inline def setHeadSizeUndefined: Self = StObject.set(x, "headSize", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
