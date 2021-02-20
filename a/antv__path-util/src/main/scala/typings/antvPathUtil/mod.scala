package typings.antvPathUtil

import typings.antvPathUtil.anon.ArcFlag
import typings.antvPathUtil.getLineIntersectMod.Point
import typings.antvPathUtil.rectPathMod.Ele
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/path-util", "catmullRom2Bezier")
  @js.native
  def catmullRom2Bezier(crp: js.Array[Double]): js.Array[js.Array[_]] = js.native
  @JSImport("@antv/path-util", "catmullRom2Bezier")
  @js.native
  def catmullRom2Bezier(crp: js.Array[Double], z: Boolean): js.Array[js.Array[_]] = js.native
  
  @JSImport("@antv/path-util", "fillPath")
  @js.native
  def fillPath(source: js.Any, target: js.Any): js.Any = js.native
  
  @JSImport("@antv/path-util", "fillPathByDiff")
  @js.native
  def fillPathByDiff(source: String, target: String): String = js.native
  
  @JSImport("@antv/path-util", "formatPath")
  @js.native
  def formatPath(fromPath: js.Array[js.Array[_]], toPath: js.Array[js.Array[_]]): js.Array[js.Array[_]] = js.native
  
  @JSImport("@antv/path-util", "getArcParams")
  @js.native
  def getArcParams(startPoint: js.Any, params: js.Any): ArcFlag = js.native
  
  @JSImport("@antv/path-util", "getLineIntersect")
  @js.native
  def getLineIntersect(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = js.native
  
  @JSImport("@antv/path-util", "isPointInPolygon")
  @js.native
  def isPointInPolygon(points: js.Any, x: js.Any, y: js.Any): Boolean = js.native
  
  @JSImport("@antv/path-util", "isPolygonsIntersect")
  @js.native
  def isPolygonsIntersect(points1: js.Any, points2: js.Any): Boolean = js.native
  
  @JSImport("@antv/path-util", "parsePath")
  @js.native
  def parsePath(p: String): js.Array[String] = js.native
  
  @JSImport("@antv/path-util", "parsePathArray")
  @js.native
  def parsePathArray(path: js.Array[_]): String = js.native
  
  @JSImport("@antv/path-util", "parsePathString")
  @js.native
  def parsePathString(pathString: String): js.Array[_] = js.native
  
  @JSImport("@antv/path-util", "path2Absolute")
  @js.native
  def path2Absolute(pathString: String): js.Array[_] = js.native
  
  @JSImport("@antv/path-util", "path2Curve")
  @js.native
  def path2Curve(path: js.Any): js.Array[_] = js.native
  @JSImport("@antv/path-util", "path2Curve")
  @js.native
  def path2Curve(path: js.Any, path2: js.Any): js.Array[_] = js.native
  
  @JSImport("@antv/path-util", "path2Segments")
  @js.native
  def path2Segments(path: js.Any): js.Array[_] = js.native
  
  @JSImport("@antv/path-util", "pathIntersection")
  @js.native
  def pathIntersection(path1: js.Any, path2: js.Any): js.Any = js.native
  
  @JSImport("@antv/path-util", "reactPath")
  @js.native
  def reactPath(x: Double, y: Double, w: Double, h: Double): js.Array[Ele] = js.native
  @JSImport("@antv/path-util", "reactPath")
  @js.native
  def reactPath(x: Double, y: Double, w: Double, h: Double, r: Double): js.Array[Ele] = js.native
}
