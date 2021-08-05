package typings.antvScale

import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3LinearMod {
  
  @JSImport("@antv/scale/lib/tick-method/d3-linear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cfg: ScaleConfig): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
