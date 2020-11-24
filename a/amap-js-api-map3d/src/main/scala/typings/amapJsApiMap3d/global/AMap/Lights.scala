package typings.amapJsApiMap3d.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Lights")
@js.native
object Lights extends js.Object {
  
  @js.native
  class AmbientLight protected ()
    extends typings.amapJsApiMap3d.AMap.Lights.AmbientLight {
    def this(color: js.Tuple3[Double, Double, Double], intensity: Double) = this()
  }
  
  @js.native
  class DirectionLight protected ()
    extends typings.amapJsApiMap3d.AMap.Lights.DirectionLight {
    def this(
      direction: js.Tuple3[Double, Double, Double],
      color: js.Tuple3[Double, Double, Double],
      intensity: Double
    ) = this()
  }
}
