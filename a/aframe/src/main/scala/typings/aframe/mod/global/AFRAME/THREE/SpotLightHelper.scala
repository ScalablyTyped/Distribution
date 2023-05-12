package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.SpotLightHelper")
@js.native
open class SpotLightHelper protected ()
  extends typings.three.mod.SpotLightHelper {
  /**
    * Create a new instance of {@link SpotLightHelper}
    * @param light The {@link THREE.SpotLight | SpotLight} to be visualized.
    * @param color If this is not the set the helper will take the color of the light. Default `light.color`
    */
  def this(light: typings.three.srcLightsLightMod.Light[
        js.UndefOr[
          typings.three.srcLightsLightShadowMod.LightShadow[typings.three.srcCamerasCameraMod.Camera]
        ]
      ]) = this()
}
