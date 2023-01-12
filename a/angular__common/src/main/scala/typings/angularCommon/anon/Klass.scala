package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.`class`
import typings.angularCommon.angularCommonStrings.ngClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Klass extends StObject {
  
  var klass: `class`
  
  var ngClass: typings.angularCommon.angularCommonStrings.ngClass
}
object Klass {
  
  inline def apply(): Klass = {
    val __obj = js.Dynamic.literal(klass = "class", ngClass = "ngClass")
    __obj.asInstanceOf[Klass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Klass] (val x: Self) extends AnyVal {
    
    inline def setKlass(value: `class`): Self = StObject.set(x, "klass", value.asInstanceOf[js.Any])
    
    inline def setNgClass(value: ngClass): Self = StObject.set(x, "ngClass", value.asInstanceOf[js.Any])
  }
}
