package typings.antvScale

import typings.antvScale.continuousMod.Continuous
import typings.antvScale.typesMod.PowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powMod {
  
  @JSImport("@antv/scale/lib/scales/pow", "Pow")
  @js.native
  open class Pow[O /* <: PowOptions */] () extends Continuous[O] {
    def this(options: PowOptions) = this()
  }
}
