package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<@antv/component.@antv/component/lib/scrollbar/scrollbar.ScrollbarStyle>> */
trait PartialReadonlyScrollbarS extends StObject {
  
  var lineCap: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var thumbColor: js.UndefOr[String] = js.undefined
  
  var trackColor: js.UndefOr[String] = js.undefined
}
object PartialReadonlyScrollbarS {
  
  inline def apply(): PartialReadonlyScrollbarS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyScrollbarS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialReadonlyScrollbarS] (val x: Self) extends AnyVal {
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
    
    inline def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
    
    inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    
    inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
  }
}
