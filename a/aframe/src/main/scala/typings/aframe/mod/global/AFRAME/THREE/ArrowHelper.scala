package typings.aframe.mod.global.AFRAME.THREE

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.ArrowHelper")
@js.native
open class ArrowHelper protected ()
  extends typings.three.mod.ArrowHelper {
  /**
    * Create a new instance of {@link ArrowHelper}
    * @param dir Direction from origin. Must be a unit vector. Default `new THREE.Vector3(0, 0, 1)`
    * @param origin Point at which the arrow starts. Default `new THREE.Vector3(0, 0, 0)`
    * @param length Length of the arrow. Default `1`
    * @param hex Hexadecimal value to define color. Default `0xffff00`
    * @param headLength The length of the head of the arrow. Default `0.2 * length`
    * @param headWidth The width of the head of the arrow. Default `0.2 * headLength`
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
