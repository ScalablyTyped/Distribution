package typings.antvG2

import typings.antvG2.libInterfaceMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionMaskRectMod {
  
  /**
    * @ignore
    * 矩形的辅助框 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/mask/rect", JSImport.Default)
  @js.native
  open class default () extends RectMask
  
  /**
    * @ignore
    * 矩形的辅助框 Action
    */
  @js.native
  trait RectMask
    extends typings.antvG2.libInteractionActionMaskBaseMod.default {
    
    /* protected */ def getRegion(): Region = js.native
  }
}
