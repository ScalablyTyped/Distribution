package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTransform extends StObject {
  
  def transform(value: js.Any, args: js.Any*): js.Any
}
object PipeTransform {
  
  inline def apply(transform: (js.Any, /* repeated */ js.Any) => js.Any): PipeTransform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[PipeTransform]
  }
  
  extension [Self <: PipeTransform](x: Self) {
    
    inline def setTransform(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
  }
}
