package typings.angularHotkeys

import typings.angular.mod.IScope
import typings.angularHotkeys.angularHotkeysStrings.INPUT
import typings.angularHotkeys.angularHotkeysStrings.SELECT
import typings.angularHotkeys.angularHotkeysStrings.TEXTAREA
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Hotkey = typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey
  
  type HotkeysProvider = typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProvider
  
  type HotkeysProviderChained = typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProviderChained
  
  /* augmented module */
  object angularAugmentingMod {
    
    object hotkeys {
      
      trait Hotkey extends StObject {
        
        /**
          * The type of event to listen for, such as keypress, keydown or keyup.
          * Usage of this parameter is discouraged as the underlying library will pick the most suitable option automatically.
          * This should only be necessary in advanced situations.
          */
        var action: js.UndefOr[String] = js.undefined
        
        /**
          * An array of tag names to allow this combo in ('INPUT', 'SELECT', and/or 'TEXTAREA')
          */
        var allowIn: js.UndefOr[js.Array[INPUT | SELECT | TEXTAREA]] = js.undefined
        
        /**
          * The function to execute when the key(s) are pressed. Passes along two arguments, event and hotkey
          */
        def callback(event: Event, hotkey: typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey): Unit
        
        /**
          * They keyboard combo (shortcut) you want to bind to.
          */
        var combo: String | js.Array[String]
        
        /**
          * The description for what the combo does and is only used for the Cheat Sheet.
          * If it is not supplied, it will not show up, and in effect, allows you to have unlisted hotkeys.
          */
        var description: js.UndefOr[String] = js.undefined
        
        /**
          * Whether the hotkey persists navigation events
          */
        var persistent: js.UndefOr[Boolean] = js.undefined
      }
      object Hotkey {
        
        inline def apply(
          callback: (Event, typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey) => Unit,
          combo: String | js.Array[String]
        ): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey = {
          val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), combo = combo.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey] (val x: Self) extends AnyVal {
          
          inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
          
          inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
          
          inline def setAllowIn(value: js.Array[INPUT | SELECT | TEXTAREA]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
          
          inline def setAllowInUndefined: Self = StObject.set(x, "allowIn", js.undefined)
          
          inline def setAllowInVarargs(value: (INPUT | SELECT | TEXTAREA)*): Self = StObject.set(x, "allowIn", js.Array(value*))
          
          inline def setCallback(value: (Event, typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
          
          inline def setCombo(value: String | js.Array[String]): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
          
          inline def setComboVarargs(value: String*): Self = StObject.set(x, "combo", js.Array(value*))
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
          
          inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
        }
      }
      
      @js.native
      trait HotkeysProvider extends StObject {
        
        /**
          * Creates a new Hotkey and creates the Mousetrap binding.
          */
        def add(
          combo: String | js.Array[String],
          description: js.UndefOr[String],
          callback: js.UndefOr[
                  js.Function2[
                    /* event */ Event, 
                    /* hotkey */ typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey, 
                    Unit
                  ]
                ],
          action: js.UndefOr[String],
          allowIn: js.UndefOr[js.Array[String]],
          persistent: js.UndefOr[Boolean]
        ): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey = js.native
        /**
          * Creates a new Hotkey and creates the Mousetrap binding.
          */
        def add(hotkeyObj: typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey = js.native
        
        /**
          * Binds the hotkey to a particular scope.
          * Useful if the scope is destroyed, we can automatically destroy the hotkey binding.
          * @param scope The scope to bind to
          */
        def bindTo(scope: IScope): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProviderChained = js.native
        
        /**
          * Configurable setting for the cheat sheet description.
          * @default 'Show / hide this help menu'
          */
        var cheatSheetDescription: String = js.native
        
        /**
          * Configurable setting for the cheat sheet hotkey.
          * @default '?'
          */
        var cheatSheetHotkey: String = js.native
        
        /**
          * Removes and unbinds a hotkey
          * @param combo The keyboard combo (shortcut) or the HotKey object
          */
        def del(combo: String): Unit = js.native
        def del(combo: js.Array[String]): Unit = js.native
        def del(combo: typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey): Unit = js.native
        
        /**
          * Returns the Hotkey object
          * @param combo The keyboard combo (shortcut)
          */
        def get(combo: String): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey = js.native
        def get(combo: js.Array[String]): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey = js.native
        
        /**
          * Configurable setting to disable the cheatsheet entirely.
          * @default true
          */
        var includeCheatSheet: Boolean = js.native
        
        /**
          * Purges all non-persistent hotkeys (such as those defined in routes)
          *
          * Without this, the same hotkey would get recreated everytime
          * the route is accessed.
          */
        def purgeHotkeys(): Unit = js.native
        
        /**
          * Cheat sheet template in the event you want to totally customize it.
          */
        var template: String = js.native
        
        /**
          * Configurable settings for the cheat sheet footer in HTML.
          * @default null
          */
        var templateFooter: String | Null = js.native
        
        /**
          * Configurable settings for the cheat sheet header in HTML.
          * This overrides the normal title if specified.
          * @default null
          */
        var templateHeader: String | Null = js.native
        
        /**
          * Configurable setting for the cheat sheet title
          * @default 'Keyboard Shortcuts'
          */
        var templateTitle: String = js.native
        
        /**
          * Toggles the help menu element's visiblity
          */
        def toggleCheatSheet(): Unit = js.native
        
        /**
          * Configurable setting to disable ngRoute hooks.
          */
        var useNgRoute: Boolean = js.native
      }
      
      @js.native
      trait HotkeysProviderChained extends StObject {
        
        def add(
          combo: String,
          description: String,
          callback: js.Function2[
                  /* event */ Event, 
                  /* hotkeys */ typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey, 
                  Unit
                ]
        ): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProviderChained = js.native
        def add(
          combo: js.Array[String],
          description: String,
          callback: js.Function2[
                  /* event */ Event, 
                  /* hotkeys */ typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey, 
                  Unit
                ]
        ): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProviderChained = js.native
        def add(hotkeyObj: typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.Hotkey): typings.angularHotkeys.mod.angularAugmentingMod.hotkeys.HotkeysProviderChained = js.native
      }
    }
  }
}
