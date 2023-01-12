package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivePageName extends StObject {
  
  val ActivePageName: String
}
object ActivePageName {
  
  inline def apply(ActivePageName: String): ActivePageName = {
    val __obj = js.Dynamic.literal(ActivePageName = ActivePageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivePageName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivePageName] (val x: Self) extends AnyVal {
    
    inline def setActivePageName(value: String): Self = StObject.set(x, "ActivePageName", value.asInstanceOf[js.Any])
  }
}
