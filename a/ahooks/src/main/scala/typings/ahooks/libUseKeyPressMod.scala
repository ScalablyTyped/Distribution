package typings.ahooks

import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.ahooks.libUtilsDomTargetMod.TargetValue
import typings.std.Document
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseKeyPressMod {
  
  @JSImport("ahooks/lib/useKeyPress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(keyFilter: KeyFilter, eventHandler: EventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyFilter.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(keyFilter: KeyFilter, eventHandler: EventHandler, option: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyFilter.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EventHandler = js.Function1[/* event */ KeyboardEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ahooks.ahooksStrings.keydown
    - typings.ahooks.ahooksStrings.keyup
  */
  trait KeyEvent extends StObject
  object KeyEvent {
    
    inline def keydown: typings.ahooks.ahooksStrings.keydown = "keydown".asInstanceOf[typings.ahooks.ahooksStrings.keydown]
    
    inline def keyup: typings.ahooks.ahooksStrings.keyup = "keyup".asInstanceOf[typings.ahooks.ahooksStrings.keyup]
  }
  
  type KeyFilter = keyType | js.Array[keyType] | (js.Function1[/* event */ KeyboardEvent, Boolean])
  
  type KeyPredicate = js.Function1[/* event */ KeyboardEvent, Boolean]
  
  trait Options extends StObject {
    
    var events: js.UndefOr[js.Array[KeyEvent]] = js.undefined
    
    var exactMatch: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[Target] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEvents(value: js.Array[KeyEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: KeyEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
      
      inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => TargetValue[HTMLElement | Document | Window]): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type Target = BasicTarget[HTMLElement | Document | Window]
  
  type keyType = Double | String
}
