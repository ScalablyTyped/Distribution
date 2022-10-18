package typings.antvG2

import typings.antvG2.libInteractionActionMod.Action
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionViewMousewheelScrollMod {
  
  @JSImport("@antv/g2/lib/interaction/action/view/mousewheel-scroll", JSImport.Default)
  @js.native
  open class default () extends MousewheelScroll
  
  @js.native
  trait MousewheelScroll extends Action[LooseObject] {
    
    def scroll(): Unit = js.native
    def scroll(arg: Any): Unit = js.native
  }
}
