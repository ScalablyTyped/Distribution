package typings.antvScale

import typings.antvScale.anon.PartialDivergingOptions
import typings.antvScale.libScalesLinearMod.Linear
import typings.antvScale.libTypesMod.DivergingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesDivergingMod {
  
  @JSImport("@antv/scale/lib/scales/diverging", "Diverging")
  @js.native
  open class Diverging () extends Linear {
    def this(options: DivergingOptions) = this()
    
    var invert: Unit = js.native
    
    def update(updateOptions: PartialDivergingOptions): Unit = js.native
  }
}
