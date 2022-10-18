package typings.antvComponent

import typings.antvComponent.libGridBaseMod.default
import typings.antvComponent.libTypesMod.GroupComponentCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/grid", "Base")
  @js.native
  open class Base[T /* <: GroupComponentCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/grid", "Circle")
  @js.native
  open class Circle ()
    extends typings.antvComponent.libGridCircleMod.default
  
  @JSImport("@antv/component/lib/grid", "Line")
  @js.native
  open class Line ()
    extends typings.antvComponent.libGridLineMod.default
}
