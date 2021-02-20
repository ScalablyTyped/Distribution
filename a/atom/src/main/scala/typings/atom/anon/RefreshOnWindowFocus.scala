package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshOnWindowFocus extends StObject {
  
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.native
}
object RefreshOnWindowFocus {
  
  @scala.inline
  def apply(): RefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOnWindowFocus]
  }
  
  @scala.inline
  implicit class RefreshOnWindowFocusMutableBuilder[Self <: RefreshOnWindowFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
  }
}
