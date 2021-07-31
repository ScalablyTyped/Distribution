package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveLink extends StObject {
  
  var activeLink: Null
}
object ActiveLink {
  
  @scala.inline
  def apply(activeLink: Null): ActiveLink = {
    val __obj = js.Dynamic.literal(activeLink = activeLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveLink]
  }
  
  @scala.inline
  implicit class ActiveLinkMutableBuilder[Self <: ActiveLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveLink(value: Null): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
  }
}
