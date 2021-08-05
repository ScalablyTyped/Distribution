package typings.antvPathUtil

import typings.antvPathUtil.anon.ArcFlag
import typings.antvPathUtil.getLineIntersectMod.Point
import typings.antvPathUtil.rectPathMod.Ele
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/path-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catmullRom2Bezier(crp: js.Array[Double]): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  inline def catmullRom2Bezier(crp: js.Array[Double], z: Boolean): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom2Bezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  inline def fillPath(source: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def fillPathByDiff(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPathByDiff")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatPath(fromPath: js.Array[js.Array[js.Any]], toPath: js.Array[js.Array[js.Any]]): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPath")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  inline def getArcParams(startPoint: js.Any, params: js.Any): ArcFlag = (^.asInstanceOf[js.Dynamic].applyDynamic("getArcParams")(startPoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ArcFlag]
  
  inline def getLineIntersect(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineIntersect")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  inline def isPointInPolygon(points: js.Any, x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPolygonsIntersect(points1: js.Any, points2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPolygonsIntersect")(points1.asInstanceOf[js.Any], points2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parsePath(p: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(p.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parsePathArray(path: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathArray")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePathString(pathString: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def path2Absolute(pathString: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Absolute")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def path2Curve(path: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def path2Curve(path: js.Any, path2: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(path.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def path2Segments(path: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Segments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def pathIntersection(path1: js.Any, path2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pathIntersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def reactPath(x: Double, y: Double, w: Double, h: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
  inline def reactPath(x: Double, y: Double, w: Double, h: Double, r: Double): js.Array[Ele] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[Ele]]
}
