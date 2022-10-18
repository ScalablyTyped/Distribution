package typings.antvScale

import typings.antvScale.libScalesBandMod.Band
import typings.antvScale.libTypesMod.BandOptions
import typings.antvScale.libTypesMod.PointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesPointMod {
  
  @JSImport("@antv/scale/lib/scales/point", "Point")
  @js.native
  open class Point () extends Band[PointOptions & BandOptions] {
    def this(options: PointOptions) = this()
    
    def update(options: PointOptions): Unit = js.native
  }
}
