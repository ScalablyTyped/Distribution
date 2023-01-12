package typings.activexLibreoffice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sequence[T] extends StObject {
  
  /* private */ var typekey: sequence[T]
}
object sequence {
  
  inline def apply[T](typekey: sequence[T]): sequence[T] = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[sequence[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sequence[?], T] (val x: Self & sequence[T]) extends AnyVal {
    
    inline def setTypekey(value: sequence[T]): Self = StObject.set(x, "typekey", value.asInstanceOf[js.Any])
  }
}
