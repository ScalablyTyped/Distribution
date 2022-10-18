package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionViewButtonMod {
  
  /**
    * Button action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/view/button", JSImport.Default)
  @js.native
  open class default () extends ButtonAction
  
  /**
    * Button action
    * @ignore
    */
  @js.native
  trait ButtonAction
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /* private */ var buttonCfg: Any = js.native
    
    /* private */ var buttonGroup: Any = js.native
    
    /* private */ var drawButton: Any = js.native
    
    /* private */ var getButtonCfg: Any = js.native
    
    /**
      * 隐藏
      */
    def hide(): Unit = js.native
    
    /* private */ var resetPosition: Any = js.native
    
    /**
      * 显示
      */
    def show(): Unit = js.native
  }
}
