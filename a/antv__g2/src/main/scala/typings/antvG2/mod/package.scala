package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type lodashFn = js.Any
  
  @scala.inline
  def markerAction(x: scala.Double, y: scala.Double, r: scala.Double, ctx: typings.std.CanvasRenderingContext2D): scala.Unit = (typings.antvG2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("markerAction")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def track(option: scala.Boolean): scala.Unit = typings.antvG2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("track")(option.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def version: java.lang.String = typings.antvG2.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
