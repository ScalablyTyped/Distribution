package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object ClassName {
  
  inline def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
