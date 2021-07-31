package typings.antvScale

import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictLimitMod {
  
  @JSImport("@antv/scale/lib/util/strict-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(cfg: ScaleConfig): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def default(cfg: ScaleConfig, defaultMin: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any], defaultMin.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def default(cfg: ScaleConfig, defaultMin: Double, defaultMax: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any], defaultMin.asInstanceOf[js.Any], defaultMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def default(cfg: ScaleConfig, defaultMin: Unit, defaultMax: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any], defaultMin.asInstanceOf[js.Any], defaultMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
