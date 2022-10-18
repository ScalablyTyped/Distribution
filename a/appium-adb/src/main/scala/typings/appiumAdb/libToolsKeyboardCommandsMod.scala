package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsKeyboardCommandsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/keyboard-commands", JSImport.Default)
  @js.native
  val default: KeyboardCommands = js.native
  
  @js.native
  trait KeyboardCommands extends StObject {
    
    /**
      * Hides software keyboard if it is visible.
      * Noop if the keyboard is already hidden.
      *
      * @param timeoutMs [1000] For how long to wait (in milliseconds)
      * until the keyboard is actually hidden.
      * @returns `false` if the keyboard was already hidden
      * @throws If the keyboard cannot be hidden.
      */
    def hideKeyboard(): js.Promise[Boolean] = js.native
    def hideKeyboard(timeoutMs: Double): js.Promise[Boolean] = js.native
    
    /**
      * Retrieve the state of the software keyboard on the device under test.
      *
      * @return The keyboard state.
      */
    def isSoftKeyboardPresent(): js.Promise[KeyboardState] = js.native
  }
  
  trait KeyboardState extends StObject {
    
    /** Whether the keyboard can be closed. */
    var canCloseKeyboard: Boolean
    
    /** Whether soft keyboard is currently visible. */
    var isKeyboardShown: Boolean
  }
  object KeyboardState {
    
    inline def apply(canCloseKeyboard: Boolean, isKeyboardShown: Boolean): KeyboardState = {
      val __obj = js.Dynamic.literal(canCloseKeyboard = canCloseKeyboard.asInstanceOf[js.Any], isKeyboardShown = isKeyboardShown.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardState]
    }
    
    extension [Self <: KeyboardState](x: Self) {
      
      inline def setCanCloseKeyboard(value: Boolean): Self = StObject.set(x, "canCloseKeyboard", value.asInstanceOf[js.Any])
      
      inline def setIsKeyboardShown(value: Boolean): Self = StObject.set(x, "isKeyboardShown", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = KeyboardCommands
  
  /* This means you don't have to write `default`, but can instead just say `libToolsKeyboardCommandsMod.foo` */
  override def _to: KeyboardCommands = default
}
