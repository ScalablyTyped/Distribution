package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointInPolygonMod {
  
  @JSImport("@antv/path-util/lib/point-in-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(points: js.Any, x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
