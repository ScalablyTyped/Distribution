package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.PointLightHelper")
@js.native
open class PointLightHelper protected ()
  extends typings.three.mod.PointLightHelper {
  /**
    * Create a new instance of {@link PointLightHelper}
    * @param light The light to be visualized.
    * @param sphereSize The size of the sphere helper. Expects a `Float`. Default `1`
    * @param color If this is not the set the helper will take the color of the light.
    */
  def this(light: typings.three.srcLightsPointLightMod.PointLight) = this()
}
