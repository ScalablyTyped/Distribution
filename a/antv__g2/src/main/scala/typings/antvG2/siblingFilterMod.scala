package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siblingFilterMod {
  
  /**
    * 数据范围过滤，但不在当前的 view 上生效，而在当前的 view 同一层级的其他 views 上生效，用于实现联动过滤。
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/data/sibling-filter", JSImport.Default)
  @js.native
  open class default () extends SiblingFilter
  
  /**
    * 数据范围过滤，但不在当前的 view 上生效，而在当前的 view 同一层级的其他 views 上生效，用于实现联动过滤。
    * @ignore
    */
  @js.native
  trait SiblingFilter
    extends typings.antvG2.rangeFilterMod.default
}
