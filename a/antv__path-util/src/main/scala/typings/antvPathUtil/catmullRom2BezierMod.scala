package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catmullRom2BezierMod {
  
  @JSImport("@antv/path-util/lib/catmull-rom-2-bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(crp: js.Array[Double]): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  @scala.inline
  def default(crp: js.Array[Double], z: Boolean): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
}
