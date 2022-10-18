package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.mod.Disposable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextMenuManagerMod {
  
  trait ContextMenuItemOptions
    extends StObject
       with ContextMenuOptions {
    
    /** Place this menu item after the menu items representing the given commands. */
    var after: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Place this menu item's group after the containing group of the menu items
      * representing the given commands.
      */
    var afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Place this menu item before the menu items representing the given commands. */
    var before: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Place this menu item's group before the containing group of the menu items
      * representing the given commands.
      */
    var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  The command to invoke on the target of the right click that invoked the
      *  context menu.
      */
    var command: js.UndefOr[String] = js.undefined
    
    /**
      *  A function that is called on the item each time a context menu is created
      *  via a right click.
      */
    var created: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      *  Whether the menu item should be clickable. Disabled menu items typically
      *  appear grayed out. Defaults to true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** The menu item's label. */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      *  A function that is called to determine whether to display this item on a
      *  given context menu deployment.
      */
    var shouldDisplay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /** An array of additional items. */
    var submenu: js.UndefOr[js.Array[ContextMenuOptions]] = js.undefined
    
    /** Whether the menu item should appear in the menu. Defaults to true. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ContextMenuItemOptions {
    
    inline def apply(): ContextMenuItemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuItemOptions]
    }
    
    extension [Self <: ContextMenuItemOptions](x: Self) {
      
      inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
      
      inline def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
      
      inline def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCreated(value: /* event */ Event => Unit): Self = StObject.set(x, "created", js.Any.fromFunction1(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setShouldDisplay(value: /* event */ Event => Unit): Self = StObject.set(x, "shouldDisplay", js.Any.fromFunction1(value))
      
      inline def setShouldDisplayUndefined: Self = StObject.set(x, "shouldDisplay", js.undefined)
      
      inline def setSubmenu(value: js.Array[ContextMenuOptions]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setSubmenuVarargs(value: ContextMenuOptions*): Self = StObject.set(x, "submenu", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ContextMenuManager extends StObject {
    
    /** Add context menu items scoped by CSS selectors. */
    def add(itemsBySelector: StringDictionary[js.Array[ContextMenuOptions]]): Disposable
  }
  object ContextMenuManager {
    
    inline def apply(add: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): ContextMenuManager = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[ContextMenuManager]
    }
    
    extension [Self <: ContextMenuManager](x: Self) {
      
      inline def setAdd(value: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atom.srcContextMenuManagerMod.ContextMenuItemOptions
    - typings.atom.anon.Type
  */
  trait ContextMenuOptions extends StObject
  object ContextMenuOptions {
    
    inline def ContextMenuItemOptions(): typings.atom.srcContextMenuManagerMod.ContextMenuItemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.atom.srcContextMenuManagerMod.ContextMenuItemOptions]
    }
    
    inline def Type(): typings.atom.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[typings.atom.anon.Type]
    }
  }
}
