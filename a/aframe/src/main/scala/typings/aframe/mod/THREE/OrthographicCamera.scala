package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.OrthographicCamera")
@js.native
class OrthographicCamera protected ()
  extends typings.three.mod.OrthographicCamera {
  /**
  	 * @param left Camera frustum left plane.
  	 * @param right Camera frustum right plane.
  	 * @param top Camera frustum top plane.
  	 * @param bottom Camera frustum bottom plane.
  	 * @param [near=0.1] Camera frustum near plane.
  	 * @param [far=2000] Camera frustum far plane.
  	 */
  def this(left: Double, right: Double, top: Double, bottom: Double) = this()
}
