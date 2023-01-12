package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rendered extends StObject {
  
  /**
    * number of display objects need to render in current frame
    */
  var rendered: Double
  
  /**
    * total display objects in scenegraph
    */
  var total: Double
}
object Rendered {
  
  inline def apply(rendered: Double, total: Double): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rendered] (val x: Self) extends AnyVal {
    
    inline def setRendered(value: Double): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
