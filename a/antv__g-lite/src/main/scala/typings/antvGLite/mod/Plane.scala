package typings.antvGLite.mod

import typings.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "Plane")
@js.native
open class Plane ()
  extends typings.antvGLite.shapesMod.Plane {
  def this(distance: Double) = this()
  def this(distance: Double, normal: vec3) = this()
  def this(distance: Unit, normal: vec3) = this()
}
