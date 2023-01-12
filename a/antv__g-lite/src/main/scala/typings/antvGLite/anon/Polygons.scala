package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polygons extends StObject {
  
  var polygons: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var polylines: js.Array[js.Array[js.Tuple2[Double, Double]]]
}
object Polygons {
  
  inline def apply(
    polygons: js.Array[js.Array[js.Tuple2[Double, Double]]],
    polylines: js.Array[js.Array[js.Tuple2[Double, Double]]]
  ): Polygons = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Polygons] (val x: Self) extends AnyVal {
    
    inline def setPolygons(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "polygons", js.Array(value*))
    
    inline def setPolylines(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "polylines", js.Array(value*))
  }
}
