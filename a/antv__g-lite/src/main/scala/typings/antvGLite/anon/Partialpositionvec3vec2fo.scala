package typings.antvGLite.anon

import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  position :gl-matrix.gl-matrix.vec3 | gl-matrix.gl-matrix.vec2,   focalPoint :gl-matrix.gl-matrix.vec3 | gl-matrix.gl-matrix.vec2,   zoom :number,   roll :number}> */
trait Partialpositionvec3vec2fo extends StObject {
  
  var focalPoint: js.UndefOr[vec3 | vec2] = js.undefined
  
  var position: js.UndefOr[vec3 | vec2] = js.undefined
  
  var roll: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Partialpositionvec3vec2fo {
  
  inline def apply(): Partialpositionvec3vec2fo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpositionvec3vec2fo]
  }
  
  extension [Self <: Partialpositionvec3vec2fo](x: Self) {
    
    inline def setFocalPoint(value: vec3 | vec2): Self = StObject.set(x, "focalPoint", value.asInstanceOf[js.Any])
    
    inline def setFocalPointUndefined: Self = StObject.set(x, "focalPoint", js.undefined)
    
    inline def setPosition(value: vec3 | vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
