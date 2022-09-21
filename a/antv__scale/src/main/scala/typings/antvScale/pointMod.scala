package typings.antvScale

import typings.antvScale.bandMod.Band
import typings.antvScale.typesMod.BandOptions
import typings.antvScale.typesMod.PointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("@antv/scale/lib/scales/point", "Point")
  @js.native
  open class Point () extends Band[PointOptions & BandOptions] {
    def this(options: PointOptions) = this()
    
    def update(options: PointOptions): Unit = js.native
  }
}
