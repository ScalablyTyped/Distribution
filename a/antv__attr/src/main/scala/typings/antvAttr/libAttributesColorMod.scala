package typings.antvAttr

import typings.antvAttr.libInterfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttributesColorMod {
  
  @JSImport("@antv/attr/lib/attributes/color", JSImport.Default)
  @js.native
  open class default protected () extends Color {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  trait Color
    extends typings.antvAttr.libAttributesBaseMod.default {
    
    def gradient(percent: Double): String = js.native
  }
}
