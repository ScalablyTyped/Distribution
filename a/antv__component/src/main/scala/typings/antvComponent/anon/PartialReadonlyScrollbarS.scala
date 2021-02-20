package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<@antv/component.@antv/component/lib/scrollbar/scrollbar.ScrollbarStyle>> */
@js.native
trait PartialReadonlyScrollbarS extends StObject {
  
  var lineCap: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var thumbColor: js.UndefOr[String] = js.native
  
  var trackColor: js.UndefOr[String] = js.native
}
object PartialReadonlyScrollbarS {
  
  @scala.inline
  def apply(): PartialReadonlyScrollbarS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyScrollbarS]
  }
  
  @scala.inline
  implicit class PartialReadonlyScrollbarSMutableBuilder[Self <: PartialReadonlyScrollbarS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
    
    @scala.inline
    def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
  }
}
