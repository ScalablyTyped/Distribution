package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionMaskPathMod {
  
  /**
    * @ignore
    * 多个点构成的 Path 辅助框 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/mask/path", JSImport.Default)
  @js.native
  open class default () extends PathMask
  
  /**
    * @ignore
    * 多个点构成的 Path 辅助框 Action
    */
  @js.native
  trait PathMask
    extends typings.antvG2.libInteractionActionMaskBaseMod.default {
    
    /**
      * 添加一个点
      */
    def addPoint(): Unit = js.native
  }
}
