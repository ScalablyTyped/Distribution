package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementSiblingFilterMod {
  
  /**
    * Sibling filter
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/element/sibling-filter", JSImport.Default)
  @js.native
  open class default () extends SiblingFilter
  
  /**
    * Sibling filter
    * @ignore
    */
  @js.native
  trait SiblingFilter
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /* protected */ var byRecord: Boolean = js.native
    
    /**
      * 过滤隐藏图形
      */
    def filter(): Unit = js.native
    
    /* private */ var filterByBBox: Any = js.native
    
    /* private */ var filterByRecord: Any = js.native
    
    /**
      * 清理所有隐藏的图形
      */
    def reset(): Unit = js.native
  }
}
