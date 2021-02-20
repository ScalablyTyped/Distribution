package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  
  val View: typings.activexOutlook.Outlook.View = js.native
}
object View {
  
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    View: typings.activexOutlook.Outlook.View
  ): View = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.activexOutlook.Outlook.View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
