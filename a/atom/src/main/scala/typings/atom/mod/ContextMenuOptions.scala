package typings.atom.mod

import typings.atom.atomStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.atom.mod.ContextMenuItemOptions
  - typings.atom.anon.Type
*/
trait ContextMenuOptions extends StObject
object ContextMenuOptions {
  
  @scala.inline
  def ContextMenuItemOptions(): typings.atom.mod.ContextMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.atom.mod.ContextMenuItemOptions]
  }
  
  @scala.inline
  def Type(`type`: separator): typings.atom.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.atom.anon.Type]
  }
}
