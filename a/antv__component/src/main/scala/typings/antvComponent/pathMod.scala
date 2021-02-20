package typings.antvComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@antv/component/lib/trend/path", "dataToPath")
  @js.native
  def dataToPath(data: js.Array[Double], width: Double, height: Double): js.Array[js.Array[_]] = js.native
  @JSImport("@antv/component/lib/trend/path", "dataToPath")
  @js.native
  def dataToPath(data: js.Array[Double], width: Double, height: Double, smooth: Boolean): js.Array[js.Array[_]] = js.native
  
  @JSImport("@antv/component/lib/trend/path", "getAreaLineY")
  @js.native
  def getAreaLineY(data: js.Array[Double], height: Double): Double = js.native
  
  @JSImport("@antv/component/lib/trend/path", "getLinePath")
  @js.native
  def getLinePath(points: js.Array[Point]): js.Array[js.Array[_]] = js.native
  
  @JSImport("@antv/component/lib/trend/path", "getSmoothLinePath")
  @js.native
  def getSmoothLinePath(points: js.Array[Point]): js.Array[js.Array[_]] = js.native
  
  @JSImport("@antv/component/lib/trend/path", "linePathToAreaPath")
  @js.native
  def linePathToAreaPath(path: js.Array[js.Array[_]], width: Double, height: Double, data: js.Array[Double]): js.Array[js.Array[_]] = js.native
  
  type Point = js.Tuple2[Double, Double]
}
