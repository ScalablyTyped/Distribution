package typings.antvGLite.mod

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "AABB")
@js.native
open class AABB ()
  extends typings.antvGLite.shapesMod.AABB {
  def this(center: vec3) = this()
  def this(center: Unit, halfExtents: vec3) = this()
  def this(center: vec3, halfExtents: vec3) = this()
}
/* static members */
object AABB {
  
  @JSImport("@antv/g-lite", "AABB")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty(aabb: typings.antvGLite.shapesAabbMod.AABB): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(aabb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
