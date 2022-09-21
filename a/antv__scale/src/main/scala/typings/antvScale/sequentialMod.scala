package typings.antvScale

import typings.antvScale.anon.PartialSequentialOptions
import typings.antvScale.linearMod.Linear
import typings.antvScale.typesMod.SequentialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequentialMod {
  
  @JSImport("@antv/scale/lib/scales/sequential", "Sequential")
  @js.native
  open class Sequential () extends Linear {
    def this(options: SequentialOptions) = this()
    
    var invert: Unit = js.native
    
    def update(updateOptions: PartialSequentialOptions): Unit = js.native
  }
}
