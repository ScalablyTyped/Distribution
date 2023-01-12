package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points extends StObject {
  
  var points: js.Array[js.Tuple2[Double, Double]]
  
  var segments: js.Array[js.Tuple2[Double, Double]]
  
  var totalLength: Double
}
object Points {
  
  inline def apply(
    points: js.Array[js.Tuple2[Double, Double]],
    segments: js.Array[js.Tuple2[Double, Double]],
    totalLength: Double
  ): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setSegments(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
  }
}
