package typings.antvAttr

import typings.antvAttr.libInterfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttributesShapeMod {
  
  @JSImport("@antv/attr/lib/attributes/shape", JSImport.Default)
  @js.native
  open class default protected () extends Shape {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  trait Shape
    extends typings.antvAttr.libAttributesBaseMod.default
}
