package typings.add2home

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object addToHome {
    
    /** Closes the popup. */
    @JSGlobal("addToHome.close")
    @js.native
    def close(): Unit = js.native
    
    /** Reset the local and session storages so the popup will show again (for automatic mode - has no affect if manually opening the popup). */
    @JSGlobal("addToHome.reset")
    @js.native
    def reset(): Unit = js.native
    
    /** Shows the popup.
      * @param {boolean} overrideChecks Override all the compatibility checks and always show the popup.
      */
    @JSGlobal("addToHome.show")
    @js.native
    def show(overrideChecks: Boolean): Unit = js.native
  }
}
