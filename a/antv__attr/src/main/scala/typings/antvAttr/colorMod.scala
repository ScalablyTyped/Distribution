package typings.antvAttr

import typings.antvAttr.interfaceMod.AttributeCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/attr/lib/attributes/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  
  @js.native
  trait Color
    extends typings.antvAttr.baseMod.default {
    
    def gradient(percent: Double): String = js.native
  }
  
  @js.native
  class default protected () extends Color {
    def this(cfg: AttributeCfg) = this()
  }
}
