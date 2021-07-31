package typings.add2home

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object addToHome {
    
    @JSGlobal("addToHome")
    @js.native
    val ^ : js.Any = js.native
    
    /** Closes the popup. */
    @scala.inline
    def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    /** Reset the local and session storages so the popup will show again (for automatic mode - has no affect if manually opening the popup). */
    @scala.inline
    def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    /** Shows the popup.
      * @param {boolean} overrideChecks Override all the compatibility checks and always show the popup.
      */
    @scala.inline
    def show(overrideChecks: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(overrideChecks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
