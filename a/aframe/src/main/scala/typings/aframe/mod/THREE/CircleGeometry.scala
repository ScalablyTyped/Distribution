package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.CircleGeometry")
@js.native
/**
  * Create a new instance of {@link CircleGeometry}
  * @param radius Radius of the circle. Expects a `Float`. Default `1`
  * @param segments Number of segments (triangles). Expects a `Integer`. Minimum `3`. Default `32`
  * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
  * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete circle_.
  */
open class CircleGeometry ()
  extends typings.three.mod.CircleGeometry
