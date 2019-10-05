package typings.aframe.aframeMod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.Raycaster")
@js.native
/**
	 * This creates a new raycaster object.
	 * @param origin The origin vector where the ray casts from.
	 * @param direction The direction vector that gives direction to the ray. Should be normalized.
	 * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
	 * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
	 */
class Raycaster ()
  extends typings.three.threeMod.Raycaster

