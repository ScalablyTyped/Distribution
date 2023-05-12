package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Klass extends StObject {
  
  var klass: Alias
  
  var ngClass: Required
}
object Klass {
  
  inline def apply(klass: Alias, ngClass: Required): Klass = {
    val __obj = js.Dynamic.literal(klass = klass.asInstanceOf[js.Any], ngClass = ngClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Klass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Klass] (val x: Self) extends AnyVal {
    
    inline def setKlass(value: Alias): Self = StObject.set(x, "klass", value.asInstanceOf[js.Any])
    
    inline def setNgClass(value: Required): Self = StObject.set(x, "ngClass", value.asInstanceOf[js.Any])
  }
}
