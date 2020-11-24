package typings.antvPathUtil

import typings.antvPathUtil.anon.ArcFlag
import typings.antvPathUtil.getLineIntersectMod.Point
import typings.antvPathUtil.rectPathMod.Ele
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/path-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def catmullRom2Bezier(crp: js.Array[Double]): js.Array[js.Array[_]] = js.native
  def catmullRom2Bezier(crp: js.Array[Double], z: Boolean): js.Array[js.Array[_]] = js.native
  
  def fillPath(source: js.Any, target: js.Any): js.Any = js.native
  
  def fillPathByDiff(source: String, target: String): String = js.native
  
  def formatPath(fromPath: js.Array[js.Array[_]], toPath: js.Array[js.Array[_]]): js.Array[js.Array[_]] = js.native
  
  def getArcParams(startPoint: js.Any, params: js.Any): ArcFlag = js.native
  
  def getLineIntersect(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = js.native
  
  def isPointInPolygon(points: js.Any, x: js.Any, y: js.Any): Boolean = js.native
  
  def isPolygonsIntersect(points1: js.Any, points2: js.Any): Boolean = js.native
  
  def parsePath(p: String): js.Array[String] = js.native
  
  def parsePathArray(path: js.Array[_]): String = js.native
  
  def parsePathString(pathString: String): js.Array[_] = js.native
  
  def path2Absolute(pathString: String): js.Array[_] = js.native
  
  def path2Curve(path: js.Any): js.Array[_] = js.native
  def path2Curve(path: js.Any, path2: js.Any): js.Array[_] = js.native
  
  def path2Segments(path: js.Any): js.Array[_] = js.native
  
  def pathIntersection(path1: js.Any, path2: js.Any): js.Any = js.native
  
  def reactPath(x: Double, y: Double, w: Double, h: Double): js.Array[Ele] = js.native
  def reactPath(x: Double, y: Double, w: Double, h: Double, r: Double): js.Array[Ele] = js.native
}
