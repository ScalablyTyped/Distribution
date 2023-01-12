package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  /**
    * ctx param in urllib's request param
    */
  var ctx: Any
  
  var timeout: Double
}
object Ctx {
  
  inline def apply(ctx: Any, timeout: Double): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
    
    inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
