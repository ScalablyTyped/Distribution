package typings.atom.mod

import typings.std.Event
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
  implicit class ContextMenuItemOptionsOps[Self <: ContextMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterGroupContainingVarargs(value: String*): Self = this.set("afterGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setAfterGroupContaining(value: js.Array[String]): Self = this.set("afterGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterGroupContaining: Self = this.set("afterGroupContaining", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeGroupContainingVarargs(value: String*): Self = this.set("beforeGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setBeforeGroupContaining(value: js.Array[String]): Self = this.set("beforeGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeGroupContaining: Self = this.set("beforeGroupContaining", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCreated(value: /* event */ Event => Unit): Self = this.set("created", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setShouldDisplay(value: /* event */ Event => Unit): Self = this.set("shouldDisplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldDisplay: Self = this.set("shouldDisplay", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: ContextMenuOptions*): Self = this.set("submenu", js.Array(value :_*))
    
    @scala.inline
    def setSubmenu(value: js.Array[ContextMenuOptions]): Self = this.set("submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
