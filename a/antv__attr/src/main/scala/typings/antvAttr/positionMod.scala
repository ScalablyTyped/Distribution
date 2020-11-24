package typings.antvAttr

import typings.antvAttr.interfaceMod.AttributeCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/attr/lib/attributes/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  
  @js.native
  trait Position
    extends typings.antvAttr.baseMod.default {
    
    def mapping(x: MappingValue, y: MappingValue): js.Array[Double | js.Array[Double]] = js.native
  }
  
  @js.native
  class default protected () extends Position {
    def this(cfg: AttributeCfg) = this()
  }
  
  type MappingValue = js.Array[Value] | Value
  
  type Value = Double | String
}
