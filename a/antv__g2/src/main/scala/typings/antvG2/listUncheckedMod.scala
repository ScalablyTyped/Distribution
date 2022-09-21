package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listUncheckedMod {
  
  /**
    * 图例项取消勾选的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/component/list-unchecked", JSImport.Default)
  @js.native
  open class default () extends ListUnchecked
  
  /**
    * 图例项取消勾选的 Action
    * @ignore
    */
  @js.native
  trait ListUnchecked
    extends typings.antvG2.listStateMod.default {
    
    /**
      * 取消勾选
      */
    def unchecked(): Unit = js.native
  }
}
