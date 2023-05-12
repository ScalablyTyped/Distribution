package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.LatheGeometry")
@js.native
/**
  * This creates a {@link LatheGeometry} based on the parameters.
  * @param points Array of Vector2s. The x-coordinate of each point must be greater than zero.
  *               Default `[new Vector2(0, -0.5), new Vector2(0.5, 0), new Vector2(0, 0.5)]` _which creates a simple diamond shape_.
  * @param segments The number of circumference segments to generate. Expects a `Integer`. Default `12`.
  * @param phiStart The starting angle in radians. Expects a `Float`. Default `0`.
  * @param phiLength The radian (0 to 2*PI) range of the lathed section 2*PI is a closed lathe, less than 2PI is a portion. Expects a `Float`. Default `Math.PI * 2`.
  */
open class LatheGeometry ()
  extends typings.three.mod.LatheGeometry
