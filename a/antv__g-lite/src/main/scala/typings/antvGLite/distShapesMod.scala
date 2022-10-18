package typings.antvGLite

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesMod {
  
  @JSImport("@antv/g-lite/dist/shapes", "AABB")
  @js.native
  open class AABB ()
    extends typings.antvGLite.distShapesAabbMod.AABB {
    def this(center: vec3) = this()
    def this(center: Unit, halfExtents: vec3) = this()
    def this(center: vec3, halfExtents: vec3) = this()
  }
  /* static members */
  object AABB {
    
    @JSImport("@antv/g-lite/dist/shapes", "AABB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmpty(aabb: typings.antvGLite.distShapesAabbMod.AABB): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(aabb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Frustum")
  @js.native
  open class Frustum ()
    extends typings.antvGLite.distShapesFrustumMod.Frustum {
    def this(planes: js.Array[typings.antvGLite.distShapesPlaneMod.Plane]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Mask")
  @js.native
  object Mask extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.distShapesFrustumMod.Mask & Double] = js.native
    
    /* 2147483647 */ val INDETERMINATE: typings.antvGLite.distShapesFrustumMod.Mask.INDETERMINATE & Double = js.native
    
    /* 0 */ val INSIDE: typings.antvGLite.distShapesFrustumMod.Mask.INSIDE & Double = js.native
    
    /* 4294967295.0 */ val OUTSIDE: typings.antvGLite.distShapesFrustumMod.Mask.OUTSIDE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Plane")
  @js.native
  open class Plane ()
    extends typings.antvGLite.distShapesPlaneMod.Plane {
    def this(distance: Double) = this()
    def this(distance: Double, normal: vec3) = this()
    def this(distance: Unit, normal: vec3) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Point")
  @js.native
  open class Point ()
    extends typings.antvGLite.distShapesPointMod.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends typings.antvGLite.distShapesRectangleMod.Rectangle {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
}
