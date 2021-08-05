package typings.antvScale

import typings.antvScale.anon.Ticks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prettyMod {
  
  @JSImport("@antv/scale/lib/util/pretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(min: Double, max: Double): Ticks = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Ticks]
  inline def default(min: Double, max: Double, n: Double): Ticks = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Ticks]
}
