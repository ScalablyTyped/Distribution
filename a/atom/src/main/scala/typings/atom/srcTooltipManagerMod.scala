package typings.atom

import typings.atom.anon.Class
import typings.atom.anon.Item
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.top_
import typings.atom.mod.Disposable
import typings.atom.srcTooltipMod.Tooltip
import typings.std.HTMLElement
import typings.std.Iterable
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTooltipManagerMod {
  
  @js.native
  trait JQueryCompatible[Element /* <: Node */]
    extends StObject
       with Iterable[Element] {
    
    var jquery: String = js.native
  }
  
  @js.native
  trait TooltipManager extends StObject {
    
    def add(target: JQueryCompatible[HTMLElement], options: Class): Disposable = js.native
    def add(target: JQueryCompatible[HTMLElement], options: Item): Disposable = js.native
    def add(target: HTMLElement, options: Class): Disposable = js.native
    /** Add a tooltip to the given element. */
    def add(target: HTMLElement, options: Item): Disposable = js.native
    
    /** Find the tooltips that have been applied to the given element. */
    def findTooltips(target: HTMLElement): js.Array[Tooltip] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atom.atomStrings.top_
    - typings.atom.atomStrings.bottom_
    - typings.atom.atomStrings.left_
    - typings.atom.atomStrings.right_
    - typings.atom.atomStrings.auto
    - typings.atom.atomStrings.`auto top`
    - typings.atom.atomStrings.`auto bottom`
    - typings.atom.atomStrings.`auto left`
    - typings.atom.atomStrings.`auto right`
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    inline def auto: typings.atom.atomStrings.auto = "auto".asInstanceOf[typings.atom.atomStrings.auto]
    
    inline def `auto bottom`: typings.atom.atomStrings.`auto bottom` = ("auto bottom").asInstanceOf[typings.atom.atomStrings.`auto bottom`]
    
    inline def `auto left`: typings.atom.atomStrings.`auto left` = ("auto left").asInstanceOf[typings.atom.atomStrings.`auto left`]
    
    inline def `auto right`: typings.atom.atomStrings.`auto right` = ("auto right").asInstanceOf[typings.atom.atomStrings.`auto right`]
    
    inline def `auto top`: typings.atom.atomStrings.`auto top` = ("auto top").asInstanceOf[typings.atom.atomStrings.`auto top`]
    
    inline def bottom: bottom_ = "bottom".asInstanceOf[bottom_]
    
    inline def left: left_ = "left".asInstanceOf[left_]
    
    inline def right: right_ = "right".asInstanceOf[right_]
    
    inline def top: top_ = "top".asInstanceOf[top_]
  }
}
