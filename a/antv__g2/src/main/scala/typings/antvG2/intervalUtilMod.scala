package typings.antvG2

import typings.antvCoord.mod.Coordinate
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvGBase.typesMod.PathCommand
import typings.std.CanvasLineCap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/interval/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundRectPath(cfg: ShapeInfo, points: js.Array[Point], coordinate: Coordinate): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundRectPath")(cfg.asInstanceOf[js.Any], points.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def getFunnelPath(points: js.Array[Point], nextPoints: js.Array[Point], isPyramid: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunnelPath")(points.asInstanceOf[js.Any], nextPoints.asInstanceOf[js.Any], isPyramid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getIntervalRectPath(points: js.Array[Point], lineCap: CanvasLineCap, coor: Coordinate): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntervalRectPath")(points.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], coor.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def getRectPath(points: js.Array[Point]): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectPath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  inline def getRectPath(points: js.Array[Point], isClosed: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectPath")(points.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def getRectPoints(pointInfo: ShapePoint): js.Array[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectPoints")(pointInfo.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point]]
  
  inline def getRectWithCornerRadius(points: js.Array[Point], coordinate: Coordinate): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectWithCornerRadius")(points.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getRectWithCornerRadius(points: js.Array[Point], coordinate: Coordinate, radius: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectWithCornerRadius")(points.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getRectWithCornerRadius(points: js.Array[Point], coordinate: Coordinate, radius: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectWithCornerRadius")(points.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def parseRadius(radius: js.Array[Double], minLength: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parseRadius(radius: Double, minLength: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRadius")(radius.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
