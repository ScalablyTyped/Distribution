package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveLink extends StObject {
  
  var activeLink: Null
}
object ActiveLink {
  
  inline def apply(activeLink: Null): ActiveLink = {
    val __obj = js.Dynamic.literal(activeLink = activeLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveLink]
  }
  
  extension [Self <: ActiveLink](x: Self) {
    
    inline def setActiveLink(value: Null): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
  }
}
