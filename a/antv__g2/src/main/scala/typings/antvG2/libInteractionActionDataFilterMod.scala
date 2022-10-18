package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionDataFilterMod {
  
  /**
    * 数据过滤。
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/data/filter", JSImport.Default)
  @js.native
  open class default () extends DataFilter
  
  /**
    * 数据过滤。
    * @ignore
    */
  @js.native
  trait DataFilter
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 过滤数据
      */
    def filter(): Unit = js.native
    
    /* private */ var filterView: Any = js.native
  }
}
