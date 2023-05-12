package typings.angularRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaCurrentWhenActive extends StObject {
  
  var ariaCurrentWhenActive: `8`
  
  var routerLinkActive: `9`
  
  var routerLinkActiveOptions: `7`
}
object AriaCurrentWhenActive {
  
  inline def apply(ariaCurrentWhenActive: `8`, routerLinkActive: `9`, routerLinkActiveOptions: `7`): AriaCurrentWhenActive = {
    val __obj = js.Dynamic.literal(ariaCurrentWhenActive = ariaCurrentWhenActive.asInstanceOf[js.Any], routerLinkActive = routerLinkActive.asInstanceOf[js.Any], routerLinkActiveOptions = routerLinkActiveOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaCurrentWhenActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaCurrentWhenActive] (val x: Self) extends AnyVal {
    
    inline def setAriaCurrentWhenActive(value: `8`): Self = StObject.set(x, "ariaCurrentWhenActive", value.asInstanceOf[js.Any])
    
    inline def setRouterLinkActive(value: `9`): Self = StObject.set(x, "routerLinkActive", value.asInstanceOf[js.Any])
    
    inline def setRouterLinkActiveOptions(value: `7`): Self = StObject.set(x, "routerLinkActiveOptions", value.asInstanceOf[js.Any])
  }
}
