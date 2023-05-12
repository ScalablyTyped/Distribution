package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.TubeGeometry")
@js.native
/**
  * Create a new instance of {@link TubeGeometry}
  * @param path A 3D path that inherits from the {@link THREE.Curve | Curve} base class.
  *             Default {@link THREE.QuadraticBezierCurve3 | new THREE.QuadraticBezierCurve3(new Vector3(-1, -1, 0 ), new Vector3(-1, 1, 0), new Vector3(1, 1, 0))}.
  * @param tubularSegments The number of segments that make up the tube. Expects a `Integer`. Default `64`.
  * @param radius The radius of the tube. Expects a `Float`. Default `1`.
  * @param radialSegments The number of segments that make up the cross-section. Expects a `Integer`. Default `8`.
  * @param closed Is the tube open or closed. Default `false`.
  */
open class TubeGeometry ()
  extends typings.three.mod.TubeGeometry
