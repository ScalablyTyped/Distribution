package typings.antvPathUtil

import typings.antvPathUtil.anon.ArcFlag
import typings.antvPathUtil.catmullRom2BezierMod.Pos
import typings.antvPathUtil.getLineIntersectMod.Point
import typings.antvPathUtil.rectPathMod.Ele
import typings.antvPathUtil.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/path-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * create bezier spline from catmull rom spline
    * @param {Array} crp Catmull Rom Points
    * @param {boolean} z Spline is loop
    * @param {Array} constraint Constraint
    */
  inline def catmullRom2Bezier(crp: js.Array[Double]): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  inline def catmullRom2Bezier(crp: js.Array[Double], z: Boolean): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def catmullRom2Bezier(crp: js.Array[Double], z: Boolean, constraint: js.Array[Pos]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  inline def catmullRom2Bezier(crp: js.Array[Double], z: Unit, constraint: js.Array[Pos]): js.Array[PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathCommand]]
  
  inline def fillPath(source: Any, target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fillPathByDiff(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPathByDiff")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatPath(fromPath: js.Array[js.Array[Any]], toPath: js.Array[js.Array[Any]]): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPath")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def getArcParams(startPoint: Any, params: Any): ArcFlag = (^.asInstanceOf[js.Dynamic].applyDynamic("getArcParams")(startPoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ArcFlag]
  
  inline def getLineIntersect(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineIntersect")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  inline def isPointInPolygon(points: Any, x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPolygonsIntersect(points1: Any, points2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPolygonsIntersect")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parsePath(p: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(p.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parsePathArray(path: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathArray")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePathString(pathString: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def path2Absolute(pathString: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def path2Curve(path: String): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def path2Curve(path: String, needZCommandIndexes: Boolean): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def path2Curve(path: js.Array[PathCommand]): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def path2Curve(path: js.Array[PathCommand], needZCommandIndexes: Boolean): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  
  inline def path2Segments(path: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Segments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def pathIntersection(path1: Any, path2: Any): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathIntersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def reactPath(x: Double, y: Double, w: Double, h: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
  inline def reactPath(x: Double, y: Double, w: Double, h: Double, r: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
}
