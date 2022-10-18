package typings.antvPathUtil

import typings.antvPathUtil.libTypesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCatmullRom2BezierMod {
  
  @JSImport("@antv/path-util/lib/catmull-rom-2-bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * create bezier spline from catmull rom spline
    * @param {Array} crp Catmull Rom Points
    * @param {boolean} z Spline is loop
    * @param {Array} constraint Constraint
    */
  inline def default(crp: js.Array[Double]): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  inline def default(crp: js.Array[Double], z: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def default(crp: js.Array[Double], z: Boolean, constraint: js.Array[Pos]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def default(crp: js.Array[Double], z: Unit, constraint: js.Array[Pos]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  type Pos = js.Tuple2[Double, Double]
}
