package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shortcut extends StObject {
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
  
  val Shortcut: OutlookBarShortcut
}
object Shortcut {
  
  inline def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any,
    Shortcut: OutlookBarShortcut
  ): Shortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcut]
  }
  
  extension [Self <: Shortcut](x: Self) {
    
    inline def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: OutlookBarShortcut): Self = StObject.set(x, "Shortcut", value.asInstanceOf[js.Any])
  }
}
