package typings.antvGLite

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesPlaneMod {
  
  @JSImport("@antv/g-lite/dist/shapes/Plane", "Plane")
  @js.native
  open class Plane () extends StObject {
    def this(distance: Double) = this()
    def this(distance: Double, normal: vec3) = this()
    def this(distance: Unit, normal: vec3) = this()
    
    var distance: Double = js.native
    
    def distanceToPoint(point: vec3): Double = js.native
    
    def intersectsLine(start: vec3, end: vec3): Boolean = js.native
    def intersectsLine(start: vec3, end: vec3, point: vec3): Boolean = js.native
    
    var normal: vec3 = js.native
    
    def normalize(): Unit = js.native
    
    /**
      * lookup table for p-vertex & n-vertex when doing frustum culling
      */
    var pnVertexFlag: Double = js.native
    
    def updatePNVertexFlag(): Unit = js.native
  }
}
