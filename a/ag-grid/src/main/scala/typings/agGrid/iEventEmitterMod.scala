package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iEventEmitterMod {
  
  @js.native
  trait IEventEmitter extends StObject {
    
    def addEventListener(eventType: String, listener: js.Function): Unit = js.native
    def addEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
    
    def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
    def removeEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
  }
}
