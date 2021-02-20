package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewView extends StObject {
  
  val View: typings.activexOutlook.Outlook.View = js.native
}
object ViewView {
  
  @scala.inline
  def apply(View: typings.activexOutlook.Outlook.View): ViewView = {
    val __obj = js.Dynamic.literal(View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewView]
  }
  
  @scala.inline
  implicit class ViewViewMutableBuilder[Self <: ViewView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView(value: typings.activexOutlook.Outlook.View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
