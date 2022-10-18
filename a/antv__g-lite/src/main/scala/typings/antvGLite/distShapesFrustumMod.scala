package typings.antvGLite

import typings.antvGLite.distShapesPlaneMod.Plane
import typings.glMatrix.mod.mat4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesFrustumMod {
  
  @JSImport("@antv/g-lite/dist/shapes/Frustum", "Frustum")
  @js.native
  open class Frustum () extends StObject {
    def this(planes: js.Array[Plane]) = this()
    
    /**
      * extract 6 planes from projectionMatrix
      * @see http://www8.cs.umu.se/kurser/5DV051/HT12/lab/plane_extraction.pdf
      */
    def extractFromVPMatrix(projectionMatrix: mat4): Unit = js.native
    
    var planes: js.Array[Plane] = js.native
  }
  
  @js.native
  sealed trait Mask extends StObject
  @JSImport("@antv/g-lite/dist/shapes/Frustum", "Mask")
  @js.native
  object Mask extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Mask & Double] = js.native
    
    @js.native
    sealed trait INDETERMINATE
      extends StObject
         with Mask
    /* 2147483647 */ val INDETERMINATE: typings.antvGLite.distShapesFrustumMod.Mask.INDETERMINATE & Double = js.native
    
    @js.native
    sealed trait INSIDE
      extends StObject
         with Mask
    /* 0 */ val INSIDE: typings.antvGLite.distShapesFrustumMod.Mask.INSIDE & Double = js.native
    
    @js.native
    sealed trait OUTSIDE
      extends StObject
         with Mask
    /* 4294967295.0 */ val OUTSIDE: typings.antvGLite.distShapesFrustumMod.Mask.OUTSIDE & Double = js.native
  }
}
