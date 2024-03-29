package typings.antvAttr

import typings.antvAttr.libInterfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttributesPositionMod {
  
  @JSImport("@antv/attr/lib/attributes/position", JSImport.Default)
  @js.native
  open class default protected () extends Position {
    def this(cfg: AttributeCfg) = this()
  }
  
  type MappingValue = js.Array[Value] | Value
  
  @js.native
  trait Position
    extends typings.antvAttr.libAttributesBaseMod.default {
    
    def mapping(x: MappingValue, y: MappingValue): js.Array[Double | js.Array[Double]] = js.native
  }
  
  type Value = Double | String
}
