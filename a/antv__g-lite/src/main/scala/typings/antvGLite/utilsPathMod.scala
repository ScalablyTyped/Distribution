package typings.antvGLite

import typings.antvGLite.anon.Polygons
import typings.antvGLite.displayObjectsMod.Circle
import typings.antvGLite.displayObjectsMod.Ellipse
import typings.antvGLite.displayObjectsMod.Line
import typings.antvGLite.displayObjectsMod.Path
import typings.antvGLite.displayObjectsMod.Polygon
import typings.antvGLite.displayObjectsMod.Polyline
import typings.antvGLite.displayObjectsMod.Rect
import typings.antvUtil.pathTypesMod.AbsoluteArray
import typings.antvUtil.pathTypesMod.CurveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPathMod {
  
  @JSImport("@antv/g-lite/dist/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToPath(`object`: Circle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Circle, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Ellipse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Ellipse, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Line): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Line, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Path, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Polygon, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Polyline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Polyline, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Rect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Rect, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extractPolygons(pathArray: AbsoluteArray): Polygons = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPolygons")(pathArray.asInstanceOf[js.Any]).asInstanceOf[Polygons]
  
  inline def getOrCalculatePathTotalLength(path: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCalculatePathTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasArcOrBezier(path: AbsoluteArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasArcOrBezier")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def path2Segments(path: CurveArray): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Segments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Unit, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
}
