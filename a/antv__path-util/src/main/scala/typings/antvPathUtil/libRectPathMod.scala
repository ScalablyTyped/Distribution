package typings.antvPathUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRectPathMod {
  
  @JSImport("@antv/path-util/lib/rect-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: Double, y: Double, w: Double, h: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
  inline def default(x: Double, y: Double, w: Double, h: Double, r: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
  
  type Ele = NumberDictionary[Double | String]
}
