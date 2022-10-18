package typings.antvG2

import typings.antvG2.libInterfaceMod.ViolinShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryViolinMod {
  
  @JSImport("@antv/g2/lib/geometry/violin", JSImport.Default)
  @js.native
  open class default () extends Violin
  
  @js.native
  trait Violin
    extends typings.antvG2.libGeometryBaseMod.default[ViolinShapePoint] {
    
    /** size 私有映射字段 */
    /* private */ var _sizeField: Any = js.native
  }
}
