package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pages extends StObject {
  
  val Pages: PropertyPages
}
object Pages {
  
  inline def apply(Pages: PropertyPages): Pages = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pages] (val x: Self) extends AnyVal {
    
    inline def setPages(value: PropertyPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
  }
}
