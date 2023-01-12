package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownClassName extends StObject {
  
  var dropdownClassName: js.UndefOr[String] = js.undefined
  
  var popupClassName: js.UndefOr[String] = js.undefined
}
object DropdownClassName {
  
  inline def apply(): DropdownClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownClassName] (val x: Self) extends AnyVal {
    
    inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
  }
}
