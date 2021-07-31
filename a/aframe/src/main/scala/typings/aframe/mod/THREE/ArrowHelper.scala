package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.ArrowHelper")
@js.native
class ArrowHelper protected ()
  extends typings.three.mod.ArrowHelper {
  /**
  	 * @param [dir=new THREE.Vector3( 0, 0, 1 )]
  	 * @param [origin=new THREE.Vector3( 0, 0, 0 )]
  	 * @param [length=1]
  	 * @param [color=0xffff00]
  	 * @param headLength
  	 * @param headWidth
  	 */
  def this(
    dir: typings.three.vector3Mod.Vector3,
    origin: js.UndefOr[typings.three.vector3Mod.Vector3],
    length: js.UndefOr[Double],
    color: js.UndefOr[typings.three.colorMod.Color | String | Double],
    headLength: js.UndefOr[Double],
    headWidth: js.UndefOr[Double]
  ) = this()
}
