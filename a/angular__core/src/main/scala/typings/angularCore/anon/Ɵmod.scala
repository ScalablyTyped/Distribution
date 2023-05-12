package typings.angularCore.anon

import typings.angularCore.mod.ɵNgModuleDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ɵmod[T] extends StObject {
  
  var ɵmod: ɵNgModuleDef[T]
}
object Ɵmod {
  
  inline def apply[T](ɵmod: ɵNgModuleDef[T]): Ɵmod[T] = {
    val __obj = js.Dynamic.literal(ɵmod = ɵmod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ɵmod[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ɵmod[?], T] (val x: Self & Ɵmod[T]) extends AnyVal {
    
    inline def setƟmod(value: ɵNgModuleDef[T]): Self = StObject.set(x, "\u0275mod", value.asInstanceOf[js.Any])
  }
}
