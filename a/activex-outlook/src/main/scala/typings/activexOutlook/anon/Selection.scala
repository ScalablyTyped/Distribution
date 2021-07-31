package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  
  val Selection: typings.activexOutlook.Outlook.Selection
}
object Selection {
  
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Selection: typings.activexOutlook.Outlook.Selection
  ): Selection = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: typings.activexOutlook.Outlook.Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
