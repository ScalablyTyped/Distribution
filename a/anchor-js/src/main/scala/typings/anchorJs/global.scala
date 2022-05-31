package typings.anchorJs

import org.scalablytyped.runtime.Shortcut
import typings.anchorJs.mod.anchorjs.Anchor
import typings.anchorJs.mod.anchorjs.AnchorOptions
import typings.anchorJs.mod.anchorjs.AnchorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AnchorJS extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AnchorJS")
    @js.native
    class ^ ()
      extends StObject
         with Anchor {
      def this(options: AnchorOptions) = this()
    }
    
    @JSGlobal("AnchorJS")
    @js.native
    val ^ : js.Object & AnchorStatic = js.native
    
    object global {
      
      @JSGlobal("anchors")
      @js.native
      val anchors: Anchor = js.native
    }
    
    type _To = js.Object & AnchorStatic
    
    /* This means you don't have to write `^`, but can instead just say `AnchorJS.foo` */
    override def _to: js.Object & AnchorStatic = ^
  }
}
