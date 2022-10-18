package typings.antvG2

import typings.antvG2.anon.StartAngle
import typings.antvG2.anon.X
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGraphicsMod {
  
  @JSImport("@antv/g2/lib/util/graphics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAngle(shapeModel: ShapeInfo, coordinate: Coordinate): StartAngle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(shapeModel.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[StartAngle]
  
  inline def getArcPath(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngleInRadian: Double,
    endAngleInRadian: Double
  ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArcPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  
  inline def getPolygonCentroid(xs: js.Array[Double], ys: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolygonCentroid")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getPolygonCentroid(xs: js.Array[Double], ys: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolygonCentroid")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getPolygonCentroid(xs: Double, ys: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolygonCentroid")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getPolygonCentroid(xs: Double, ys: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolygonCentroid")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getReplaceAttrs(sourceShape: IShape, targetShape: IShape): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getReplaceAttrs")(sourceShape.asInstanceOf[js.Any], targetShape.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSectorPath(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngleInRadian: Double,
    endAngleInRadian: Double
  ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  inline def getSectorPath(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngleInRadian: Double,
    endAngleInRadian: Double,
    innerRadius: Double
  ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  
  inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInRadian: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInRadian.asInstanceOf[js.Any])).asInstanceOf[X]
}
