package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  position :[number, number, number] | std.Float32Array | [number, number],   focalPoint :[number, number, number] | std.Float32Array | [number, number],   zoom :number,   roll :number}> */
trait Partialpositionnumbernumb extends StObject {
  
  var focalPoint: js.UndefOr[
    (js.Tuple3[Double, Double, Double]) | js.typedarray.Float32Array | (js.Tuple2[Double, Double])
  ] = js.undefined
  
  var position: js.UndefOr[
    (js.Tuple3[Double, Double, Double]) | js.typedarray.Float32Array | (js.Tuple2[Double, Double])
  ] = js.undefined
  
  var roll: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Partialpositionnumbernumb {
  
  inline def apply(): Partialpositionnumbernumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpositionnumbernumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialpositionnumbernumb] (val x: Self) extends AnyVal {
    
    inline def setFocalPoint(
      value: (js.Tuple3[Double, Double, Double]) | js.typedarray.Float32Array | (js.Tuple2[Double, Double])
    ): Self = StObject.set(x, "focalPoint", value.asInstanceOf[js.Any])
    
    inline def setFocalPointUndefined: Self = StObject.set(x, "focalPoint", js.undefined)
    
    inline def setPosition(
      value: (js.Tuple3[Double, Double, Double]) | js.typedarray.Float32Array | (js.Tuple2[Double, Double])
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
