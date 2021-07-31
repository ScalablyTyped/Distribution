package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("atom")
  @js.native
  val atom: AtomEnvironment = js.native
  
  trait HTMLElementTagNameMap extends StObject {
    
    var `atom-text-editor`: TextEditorElement
  }
  object HTMLElementTagNameMap {
    
    @scala.inline
    def apply(`atom-text-editor`: TextEditorElement): HTMLElementTagNameMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLElementTagNameMap]
    }
    
    @scala.inline
    implicit class HTMLElementTagNameMapMutableBuilder[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAtom-text-editor`(value: TextEditorElement): Self = StObject.set(x, "atom-text-editor", value.asInstanceOf[js.Any])
    }
  }
}
