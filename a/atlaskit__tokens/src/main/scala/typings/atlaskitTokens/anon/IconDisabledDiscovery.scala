package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconDisabledDiscovery[BaseToken] extends StObject {
  
  var icon: DisabledDiscovery[BaseToken]
}
object IconDisabledDiscovery {
  
  inline def apply[BaseToken](icon: DisabledDiscovery[BaseToken]): IconDisabledDiscovery[BaseToken] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDisabledDiscovery[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconDisabledDiscovery[?], BaseToken] (val x: Self & IconDisabledDiscovery[BaseToken]) extends AnyVal {
    
    inline def setIcon(value: DisabledDiscovery[BaseToken]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
