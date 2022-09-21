package typings.aframe.mod.THREE

import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.SpotLight")
@js.native
open class SpotLight protected ()
  extends typings.three.mod.SpotLight {
  def this(
    color: js.UndefOr[ColorRepresentation],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}
