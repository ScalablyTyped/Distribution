package typings.antvGLite

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesMod {
  
  @JSImport("@antv/g-lite/dist/shapes", "AABB")
  @js.native
  open class AABB ()
    extends typings.antvGLite.shapesAabbMod.AABB {
    def this(center: vec3) = this()
    def this(center: Unit, halfExtents: vec3) = this()
    def this(center: vec3, halfExtents: vec3) = this()
  }
  /* static members */
  object AABB {
    
    @JSImport("@antv/g-lite/dist/shapes", "AABB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmpty(aabb: typings.antvGLite.shapesAabbMod.AABB): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(aabb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Frustum")
  @js.native
  open class Frustum ()
    extends typings.antvGLite.frustumMod.Frustum {
    def this(planes: js.Array[typings.antvGLite.planeMod.Plane]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Mask")
  @js.native
  object Mask extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.frustumMod.Mask & Double] = js.native
    
    /* 2147483647 */ val INDETERMINATE: typings.antvGLite.frustumMod.Mask.INDETERMINATE & Double = js.native
    
    /* 0 */ val INSIDE: typings.antvGLite.frustumMod.Mask.INSIDE & Double = js.native
    
    /* 4294967295.0 */ val OUTSIDE: typings.antvGLite.frustumMod.Mask.OUTSIDE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Plane")
  @js.native
  open class Plane ()
    extends typings.antvGLite.planeMod.Plane {
    def this(distance: Double) = this()
    def this(distance: Double, normal: vec3) = this()
    def this(distance: Unit, normal: vec3) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Point")
  @js.native
  open class Point ()
    extends typings.antvGLite.pointMod.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends typings.antvGLite.rectangleMod.Rectangle {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
}
