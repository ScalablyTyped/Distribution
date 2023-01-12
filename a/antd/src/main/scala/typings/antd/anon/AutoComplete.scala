package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoComplete extends StObject {
  
  var autoComplete: js.UndefOr[String] = js.undefined
}
object AutoComplete {
  
  inline def apply(): AutoComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoComplete] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
  }
}
