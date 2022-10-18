package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentAxisAxisDescriptionMod {
  
  @JSImport("@antv/g2/lib/interaction/action/component/axis/axis-description", JSImport.Default)
  @js.native
  open class default () extends AxisDescription
  
  @js.native
  trait AxisDescription
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    def hide(): Unit = js.native
    
    def renderTooltip(): Unit = js.native
    
    def show(): Unit = js.native
    
    /* private */ var tooltip: Any = js.native
  }
}
