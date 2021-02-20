package typings.atom.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuItemOptions extends ContextMenuOptions {
  
  /** Place this menu item after the menu items representing the given commands. */
  var after: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Place this menu item's group after the containing group of the menu items
    * representing the given commands.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
  
  /** Place this menu item before the menu items representing the given commands. */
  var before: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Place this menu item's group before the containing group of the menu items
    * representing the given commands.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  The command to invoke on the target of the right click that invoked the
    *  context menu.
    */
  var command: js.UndefOr[String] = js.native
  
  /**
    *  A function that is called on the item each time a context menu is created
    *  via a right click.
    */
  var created: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    *  Whether the menu item should be clickable. Disabled menu items typically
    *  appear grayed out. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** The menu item's label. */
  var label: js.UndefOr[String] = js.native
  
  /**
    *  A function that is called to determine whether to display this item on a
    *  given context menu deployment.
    */
  var shouldDisplay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /** An array of additional items. */
  var submenu: js.UndefOr[js.Array[ContextMenuOptions]] = js.native
  
  /** Whether the menu item should appear in the menu. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.native
}
object ContextMenuItemOptions {
  
  @scala.inline
  def apply(): ContextMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuItemOptions]
  }
  
  @scala.inline
  implicit class ContextMenuItemOptionsMutableBuilder[Self <: ContextMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
    
    @scala.inline
    def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
    
    @scala.inline
    def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCreated(value: /* event */ Event => Unit): Self = StObject.set(x, "created", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setShouldDisplay(value: /* event */ Event => Unit): Self = StObject.set(x, "shouldDisplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldDisplayUndefined: Self = StObject.set(x, "shouldDisplay", js.undefined)
    
    @scala.inline
    def setSubmenu(value: js.Array[ContextMenuOptions]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: ContextMenuOptions*): Self = StObject.set(x, "submenu", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
