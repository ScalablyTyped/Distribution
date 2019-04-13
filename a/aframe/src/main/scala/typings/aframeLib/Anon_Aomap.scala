package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aomap extends js.Object {
  var aomap: threeLib.Anon_AoMap
  var bumpmap: threeLib.Anon_BumpMap
  var common: threeLib.Anon_AlphaMap
  var displacementmap: threeLib.Anon_DisplacementBias
  var emissivemap: threeLib.Anon_EmissiveMap
  var envmap: threeLib.Anon_EnvMap
  var fog: threeLib.Anon_FogColor
  var gradientmap: threeLib.Anon_GradientMap
  var lightmap: threeLib.Anon_LightMap
  var lights: threeLib.Anon_AmbientLightColor
  var metalnessmap: threeLib.Anon_MetalnessMap
  var normalmap: threeLib.Anon_NormalMap
  var points: threeLib.Anon_Diffuse
  var roughnessmap: threeLib.Anon_RoughnessMap
  var specularmap: threeLib.Anon_SpecularMap
}

object Anon_Aomap {
  @scala.inline
  def apply(
    aomap: threeLib.Anon_AoMap,
    bumpmap: threeLib.Anon_BumpMap,
    common: threeLib.Anon_AlphaMap,
    displacementmap: threeLib.Anon_DisplacementBias,
    emissivemap: threeLib.Anon_EmissiveMap,
    envmap: threeLib.Anon_EnvMap,
    fog: threeLib.Anon_FogColor,
    gradientmap: threeLib.Anon_GradientMap,
    lightmap: threeLib.Anon_LightMap,
    lights: threeLib.Anon_AmbientLightColor,
    metalnessmap: threeLib.Anon_MetalnessMap,
    normalmap: threeLib.Anon_NormalMap,
    points: threeLib.Anon_Diffuse,
    roughnessmap: threeLib.Anon_RoughnessMap,
    specularmap: threeLib.Anon_SpecularMap
  ): Anon_Aomap = {
    val __obj = js.Dynamic.literal(aomap = aomap, bumpmap = bumpmap, common = common, displacementmap = displacementmap, emissivemap = emissivemap, envmap = envmap, fog = fog, gradientmap = gradientmap, lightmap = lightmap, lights = lights, metalnessmap = metalnessmap, normalmap = normalmap, points = points, roughnessmap = roughnessmap, specularmap = specularmap)
  
    __obj.asInstanceOf[Anon_Aomap]
  }
}

