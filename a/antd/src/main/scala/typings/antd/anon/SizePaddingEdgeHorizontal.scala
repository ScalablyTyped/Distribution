package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizePaddingEdgeHorizontal extends StObject {
  
  var sizePaddingEdgeHorizontal: Double
}
object SizePaddingEdgeHorizontal {
  
  inline def apply(sizePaddingEdgeHorizontal: Double): SizePaddingEdgeHorizontal = {
    val __obj = js.Dynamic.literal(sizePaddingEdgeHorizontal = sizePaddingEdgeHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePaddingEdgeHorizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizePaddingEdgeHorizontal] (val x: Self) extends AnyVal {
    
    inline def setSizePaddingEdgeHorizontal(value: Double): Self = StObject.set(x, "sizePaddingEdgeHorizontal", value.asInstanceOf[js.Any])
  }
}
