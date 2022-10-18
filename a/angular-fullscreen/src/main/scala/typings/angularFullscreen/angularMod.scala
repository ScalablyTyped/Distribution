package typings.angularFullscreen

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object fullscreen {
    
    /**
      * Prefixing interface name with "I" is not recommended: https://www.typescriptlang.org/Handbook#writing-dts-files
      * However, we let it here to keep consistency with all the other Angular-related definitions
      */
    @js.native
    trait IFullscreen extends StObject {
      
      // enable document fullscreen
      def all(): Unit = js.native
      
      // disable fullscreen
      def cancel(): Unit = js.native
      
      // enable fullscreen to a specific element
      def enable(element: Element): Unit = js.native
      def enable(element: HTMLElement): Unit = js.native
      
      // return true if fullscreen is enabled, otherwise false
      def isEnabled(): Boolean = js.native
      
      // return true if fullscreen API is supported by your browser
      def isSupported(): Boolean = js.native
      
      // enable or disable the document fullscreen
      def toggleAll(): Unit = js.native
    }
  }
}
