package typings.antvG2

import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.Position
import typings.antvGBase.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPathMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/util/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catmullRom2bezier(crp: js.Array[Double], z: Boolean, constraint: js.Array[Position]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def convertNormalPath(coord: Any, path: js.Array[PathCommand]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertNormalPath")(coord.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def convertPolarPath(coord: Any, path: js.Array[PathCommand]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPolarPath")(coord.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def getLinePath(points: js.Array[Point]): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  inline def getLinePath(points: js.Array[Point], isInCircle: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def getSplinePath(points: js.Array[Point]): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean, constaint: js.Array[Position]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Unit, constaint: js.Array[Position]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def smoothBezier(points: js.Array[Position], smooth: Double, isLoop: Boolean, constraint: js.Array[Position]): js.Array[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothBezier")(points.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], isLoop.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Position]]
}
