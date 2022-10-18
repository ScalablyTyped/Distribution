package typings.aframe.mod.global.AFRAME.THREE

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.ArrowHelper")
@js.native
open class ArrowHelper protected ()
  extends typings.three.mod.ArrowHelper {
  /**
    * @param [dir] Direction from origin. Must be a unit vector.
    * @param [origin] Point at which the arrow starts.
    * @param [length] Length of the arrow.
    * @param [color] Hexadecimal value to define color.
    * @param [headLength] The length of the head of the arrow.
    * @param [headWidth] The width of the head of the arrow.
    */
  def this(
    dir: js.UndefOr[typings.three.srcMathVector3Mod.Vector3],
    origin: js.UndefOr[typings.three.srcMathVector3Mod.Vector3],
    length: js.UndefOr[Double],
    color: js.UndefOr[ColorRepresentation],
    headLength: js.UndefOr[Double],
    headWidth: js.UndefOr[Double]
  ) = this()
}
