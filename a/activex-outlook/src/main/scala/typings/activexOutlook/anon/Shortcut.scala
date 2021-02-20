package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shortcut extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  
  val Shortcut: OutlookBarShortcut = js.native
}
object Shortcut {
  
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: OutlookBarShortcut
  ): Shortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcut]
  }
  
  @scala.inline
  implicit class ShortcutMutableBuilder[Self <: Shortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcut(value: OutlookBarShortcut): Self = StObject.set(x, "Shortcut", value.asInstanceOf[js.Any])
  }
}
