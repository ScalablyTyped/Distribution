package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Readonly<@antv/component.@antv/component/lib/scrollbar/scrollbar.ScrollbarStyle>, 'thumbColor'> */
trait PickReadonlyScrollbarStyl extends StObject {
  
  var thumbColor: String
}
object PickReadonlyScrollbarStyl {
  
  inline def apply(thumbColor: String): PickReadonlyScrollbarStyl = {
    val __obj = js.Dynamic.literal(thumbColor = thumbColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReadonlyScrollbarStyl]
  }
  
  extension [Self <: PickReadonlyScrollbarStyl](x: Self) {
    
    inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
  }
}
