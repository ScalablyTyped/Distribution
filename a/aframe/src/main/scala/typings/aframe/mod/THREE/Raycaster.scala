package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.Raycaster")
@js.native
/**
  * This creates a new {@link Raycaster} object.
  * @param origin The origin vector where the ray casts from. Default `new Vector3()`
  * @param direction The direction vector that gives direction to the ray. Should be normalized. Default `new Vector3(0, 0, -1)`
  * @param near All results returned are further away than near. Near can't be negative. Expects a `Float`. Default `0`
  * @param far All results returned are closer than far. Far can't be lower than near. Expects a `Float`. Default `Infinity`
  */
open class Raycaster ()
  extends typings.three.mod.Raycaster
