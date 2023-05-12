package typings.ansiAlign

import org.scalablytyped.runtime.Shortcut
import typings.ansiAlign.anon.Pad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ansi-align", JSImport.Namespace)
  @js.native
  val ^ : AnsiAlign = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiAlign.ansiAlignStrings.left
    - typings.ansiAlign.ansiAlignStrings.center
    - typings.ansiAlign.ansiAlignStrings.right
  */
  trait Align extends StObject
  object Align {
    
    inline def center: typings.ansiAlign.ansiAlignStrings.center = "center".asInstanceOf[typings.ansiAlign.ansiAlignStrings.center]
    
    inline def left: typings.ansiAlign.ansiAlignStrings.left = "left".asInstanceOf[typings.ansiAlign.ansiAlignStrings.left]
    
    inline def right: typings.ansiAlign.ansiAlignStrings.right = "right".asInstanceOf[typings.ansiAlign.ansiAlignStrings.right]
  }
  
  @js.native
  trait AnsiAlign extends StObject {
    
    def apply(text: String): String = js.native
    def apply(text: String, opts: typings.ansiAlign.anon.Align): String = js.native
    def apply(text: js.Array[String]): js.Array[String] = js.native
    def apply(text: js.Array[String], opts: Pad): js.Array[String] = js.native
    
    def center(text: String): String = js.native
    def center(text: js.Array[String]): js.Array[String] = js.native
    
    def left(text: String): String = js.native
    def left(text: js.Array[String]): js.Array[String] = js.native
    
    def right(text: String): String = js.native
    def right(text: js.Array[String]): js.Array[String] = js.native
  }
  
  type _To = AnsiAlign
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AnsiAlign = ^
}
