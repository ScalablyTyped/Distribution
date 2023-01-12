package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelShortcut extends StObject {
  
  var Cancel: Boolean
  
  val Shortcut: OutlookBarShortcut
}
object CancelShortcut {
  
  inline def apply(Cancel: Boolean, Shortcut: OutlookBarShortcut): CancelShortcut = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelShortcut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelShortcut] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: OutlookBarShortcut): Self = StObject.set(x, "Shortcut", value.asInstanceOf[js.Any])
  }
}
