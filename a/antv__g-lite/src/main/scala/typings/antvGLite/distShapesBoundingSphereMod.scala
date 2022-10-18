package typings.antvGLite

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesBoundingSphereMod {
  
  @JSImport("@antv/g-lite/dist/shapes/BoundingSphere", "BoundingSphere")
  @js.native
  open class BoundingSphere () extends StObject {
    def this(center: vec3) = this()
    def this(center: Unit, radius: Double) = this()
    def this(center: vec3, radius: Double) = this()
    
    var center: vec3 = js.native
    
    def containsPoint(point: vec3): Boolean = js.native
    
    def intersects(sphere: BoundingSphere): Boolean = js.native
    
    var radius: Double = js.native
  }
}
