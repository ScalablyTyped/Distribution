package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTransform extends StObject {
  
  def transform(value: Any, args: Any*): Any
}
object PipeTransform {
  
  inline def apply(transform: (Any, /* repeated */ Any) => Any): PipeTransform = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[PipeTransform]
  }
  
  extension [Self <: PipeTransform](x: Self) {
    
    inline def setTransform(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
  }
}
