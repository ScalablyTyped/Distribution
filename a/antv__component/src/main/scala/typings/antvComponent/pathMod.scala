package typings.antvComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@antv/component/lib/trend/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dataToPath(data: js.Array[Double], width: Double, height: Double): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToPath")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  inline def dataToPath(data: js.Array[Double], width: Double, height: Double, smooth: Boolean): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToPath")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  inline def getAreaLineY(data: js.Array[Double], height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAreaLineY")(data.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLinePath(points: js.Array[Point]): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  inline def getSmoothLinePath(points: js.Array[Point]): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSmoothLinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  inline def linePathToAreaPath(path: js.Array[js.Array[js.Any]], width: Double, height: Double, data: js.Array[Double]): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("linePathToAreaPath")(path.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  type Point = js.Tuple2[Double, Double]
}
