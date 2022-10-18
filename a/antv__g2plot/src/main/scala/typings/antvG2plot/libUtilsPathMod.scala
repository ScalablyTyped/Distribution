package typings.antvG2plot

import typings.antvG2plot.libTypesCommonMod.Point
import typings.antvG2plot.libTypesCommonMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPathMod {
  
  @JSImport("@antv/g2plot/lib/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catmullRom2bezier(crp: js.Array[Double], z: Boolean, constraint: js.Array[Position]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getSplinePath(points: js.Array[Point]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean, constaint: js.Array[Position]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Unit, constaint: js.Array[Position]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def points2Path(points: js.Array[Point], isInCircle: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("points2Path")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def smoothBezier(points: js.Array[Position], smooth: Double, isLoop: Boolean, constraint: js.Array[Position]): js.Array[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothBezier")(points.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], isLoop.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Position]]
}
