package typings.antvG2

import typings.antvG2.pathMod.PathCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("@antv/g2/lib/geometry/line", JSImport.Default)
  @js.native
  open class default protected () extends Line {
    def this(cfg: PathCfg) = this()
  }
  
  @js.native
  trait Line
    extends typings.antvG2.pathMod.default
}
