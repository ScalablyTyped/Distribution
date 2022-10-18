package typings.antvGLite

import typings.antvGLite.distShapesAabbMod.AABB
import typings.antvGLite.distShapesBoundingSphereMod.BoundingSphere
import typings.antvGLite.distShapesPlaneMod.Plane
import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesRayMod {
  
  @JSImport("@antv/g-lite/dist/shapes/Ray", "Ray")
  @js.native
  open class Ray protected () extends StObject {
    def this(origin: vec3, direction: vec3) = this()
    
    var direction: vec3 = js.native
    
    /* private */ var intersectAABBWithIntersection: Any = js.native
    
    def intersectsAABB(aabb: AABB): Boolean = js.native
    def intersectsAABB(aabb: AABB, intersection: vec3): Boolean = js.native
    
    /**
      * faster than implements like Three.js
      * @see https://github.com/playcanvas/engine/blob/master/src/shape/bounding-box.js#L161
      */
    /* private */ var intersectsAABBWithoutIntersection: Any = js.native
    
    def intersectsPlane(plane: Plane): Boolean = js.native
    def intersectsPlane(plane: Plane, intersection: vec3): Boolean = js.native
    
    def intersectsSphere(sphere: BoundingSphere): Boolean = js.native
    def intersectsSphere(sphere: BoundingSphere, intersection: vec3): Boolean = js.native
    
    var origin: vec3 = js.native
  }
}
