package typings.antvScale

import typings.antvScale.anon.PartialSequentialOptions
import typings.antvScale.libScalesLinearMod.Linear
import typings.antvScale.libTypesMod.SequentialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesSequentialMod {
  
  @JSImport("@antv/scale/lib/scales/sequential", "Sequential")
  @js.native
  open class Sequential () extends Linear {
    def this(options: SequentialOptions) = this()
    
    var invert: Unit = js.native
    
    def update(updateOptions: PartialSequentialOptions): Unit = js.native
  }
}
