package typings.antvG2

import typings.antvG2.libInterfaceMod.ActionCallback
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  @JSImport("@antv/g2/lib/interaction/action/callback", JSImport.Default)
  @js.native
  open class default () extends CallbackAction
  
  @js.native
  trait CallbackAction
    extends typings.antvG2.actionBaseMod.default[LooseObject] {
    
    /**
      * 回调函数
      */
    def callback(context: IInteractionContext): Unit = js.native
    /**
      * 回调函数
      */
    @JSName("callback")
    var callback_Original: ActionCallback = js.native
    
    /**
      * 执行
      */
    def execute(): Unit = js.native
  }
}
