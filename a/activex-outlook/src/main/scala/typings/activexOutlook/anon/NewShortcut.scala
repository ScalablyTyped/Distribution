package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewShortcut extends StObject {
  
  val NewShortcut: OutlookBarShortcut = js.native
}
object NewShortcut {
  
  @scala.inline
  def apply(NewShortcut: OutlookBarShortcut): NewShortcut = {
    val __obj = js.Dynamic.literal(NewShortcut = NewShortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewShortcut]
  }
  
  @scala.inline
  implicit class NewShortcutMutableBuilder[Self <: NewShortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewShortcut(value: OutlookBarShortcut): Self = StObject.set(x, "NewShortcut", value.asInstanceOf[js.Any])
  }
}
