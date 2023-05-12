package typings.anchorJs

import org.scalablytyped.runtime.Shortcut
import typings.anchorJs.mod.anchorjs.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AnchorJS extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AnchorJS")
    @js.native
    open class ^ ()
      extends StObject
         with typings.anchorJs.mod.anchorjs.AnchorJS {
      def this(options: Options) = this()
    }
    
    @JSGlobal("AnchorJS")
    @js.native
    val ^ : js.Object & typings.anchorJs.mod.anchorjs.AnchorJS = js.native
    
    object global {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("anchors")
      @js.native
      open class anchors ()
        extends StObject
           with typings.anchorJs.mod.anchorjs.AnchorJS {
        def this(options: Options) = this()
      }
      @JSGlobal("anchors")
      @js.native
      val anchors: typings.anchorJs.mod.anchorjs.AnchorJS = js.native
    }
    
    type _To = js.Object & typings.anchorJs.mod.anchorjs.AnchorJS
    
    /* This means you don't have to write `^`, but can instead just say `AnchorJS.foo` */
    override def _to: js.Object & typings.anchorJs.mod.anchorjs.AnchorJS = ^
  }
}
