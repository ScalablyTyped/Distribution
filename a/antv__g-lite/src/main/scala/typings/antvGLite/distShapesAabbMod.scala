package typings.antvGLite

import typings.antvGLite.distShapesPlaneMod.Plane
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesAabbMod {
  
  @JSImport("@antv/g-lite/dist/shapes/AABB", "AABB")
  @js.native
  open class AABB () extends StObject {
    def this(center: vec3) = this()
    def this(center: Unit, halfExtents: vec3) = this()
    def this(center: vec3, halfExtents: vec3) = this()
    
    def add(aabb: AABB): Unit = js.native
    
    var center: vec3 = js.native
    
    def containsPoint(point: vec3): Boolean = js.native
    
    def getMax(): vec3 = js.native
    
    def getMin(): vec3 = js.native
    
    /**
      * get n-vertex
      * @param plane plane of CullingVolume
      */
    def getNegativeFarPoint(plane: Plane): vec3 = js.native
    
    /**
      * get p-vertex
      * @param plane plane of CullingVolume
      */
    def getPositiveFarPoint(plane: Plane): vec3 = js.native
    
    var halfExtents: vec3 = js.native
    
    def intersection(aabb: AABB): AABB | Null = js.native
    
    def intersects(aabb: AABB): Boolean = js.native
    
    var max: vec3 = js.native
    
    var min: vec3 = js.native
    
    def setFromTransformedAABB(aabb: AABB, m: mat4): Unit = js.native
    
    def setMinMax(min: vec3, max: vec3): Unit = js.native
    
    def update(): Unit = js.native
    def update(center: Unit, halfExtents: vec3): Unit = js.native
    def update(center: vec3): Unit = js.native
    def update(center: vec3, halfExtents: vec3): Unit = js.native
  }
  /* static members */
  object AABB {
    
    @JSImport("@antv/g-lite/dist/shapes/AABB", "AABB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmpty(aabb: AABB): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(aabb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
