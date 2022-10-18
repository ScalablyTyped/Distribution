package typings.antvG2plot.anon

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  /** 文本格式化 */
  var formatter: js.UndefOr[js.Function2[/* prev */ Double, /* next */ Double, String]] = js.undefined
  
  /** 文字大小 */
  var size: js.UndefOr[Double] = js.undefined
  
  /** 文字样式 */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object Formatter {
  
  inline def apply(): Formatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setFormatter(value: (/* prev */ Double, /* next */ Double) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
