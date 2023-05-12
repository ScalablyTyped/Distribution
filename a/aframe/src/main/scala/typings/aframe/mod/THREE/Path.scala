package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.Path")
@js.native
/**
  * Creates a {@link Path} from the points
  * @remarks
  * The first point defines the offset, then successive points are added to the {@link CurvePath.curves | curves} array as {@link LineCurve | LineCurves}.
  * If no points are specified, an empty {@link Path} is created and the {@link .currentPoint} is set to the origin.
  * @param points Array of {@link Vector2 | Vector2s}.
  */
open class Path ()
  extends typings.three.mod.Path
