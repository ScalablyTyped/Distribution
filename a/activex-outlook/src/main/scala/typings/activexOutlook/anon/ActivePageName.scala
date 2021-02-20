package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivePageName extends StObject {
  
  val ActivePageName: String = js.native
}
object ActivePageName {
  
  @scala.inline
  def apply(ActivePageName: String): ActivePageName = {
    val __obj = js.Dynamic.literal(ActivePageName = ActivePageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivePageName]
  }
  
  @scala.inline
  implicit class ActivePageNameMutableBuilder[Self <: ActivePageName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivePageName(value: String): Self = StObject.set(x, "ActivePageName", value.asInstanceOf[js.Any])
  }
}
