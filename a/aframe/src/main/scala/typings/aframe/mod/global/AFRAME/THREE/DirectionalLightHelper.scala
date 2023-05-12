package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.DirectionalLightHelper")
@js.native
open class DirectionalLightHelper protected ()
  extends typings.three.mod.DirectionalLightHelper {
  /**
    * Create a new instance of {@link DirectionalLightHelper}
    * @param light The light to be visualized.
    * @param size Dimensions of the plane. Default `1`
    * @param color If this is not the set the helper will take the color of the light. Default `light.color`
    */
  def this(light: typings.three.srcLightsDirectionalLightMod.DirectionalLight) = this()
}
