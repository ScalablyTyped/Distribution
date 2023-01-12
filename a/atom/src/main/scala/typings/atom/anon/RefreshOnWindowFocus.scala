package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshOnWindowFocus extends StObject {
  
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}
object RefreshOnWindowFocus {
  
  inline def apply(): RefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOnWindowFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshOnWindowFocus] (val x: Self) extends AnyVal {
    
    inline def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
  }
}
