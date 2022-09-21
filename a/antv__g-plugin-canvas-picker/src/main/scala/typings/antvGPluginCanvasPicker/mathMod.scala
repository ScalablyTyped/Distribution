package typings.antvGPluginCanvasPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def inArc(
    cx: Double,
    cy: Double,
    r: Double,
    startAngle: Double,
    endAngle: Double,
    lineWidth: Double,
    x: Double,
    y: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inArc")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], r.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], lineWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inBox(minX: Double, minY: Double, width: Double, height: Double, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inBox")(minX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inLine(x1: Double, y1: Double, x2: Double, y2: Double, lineWidth: Double, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inLine")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], lineWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inPolygon(points: js.Array[Any], x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inPolygon")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inPolygons(polygons: js.Array[Any], x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inPolygons")(polygons.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inPolyline(points: js.Array[Any], lineWidth: Double, x: Double, y: Double, isClose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inPolyline")(points.asInstanceOf[js.Any], lineWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], isClose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inRect(minX: Double, minY: Double, width: Double, height: Double, lineWidth: Double, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRect")(minX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], lineWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
