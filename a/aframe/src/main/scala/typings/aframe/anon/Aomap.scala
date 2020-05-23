package typings.aframe.anon

import typings.three.anon.AlphaMap
import typings.three.anon.AmbientLightColor
import typings.three.anon.AoMap
import typings.three.anon.BumpMap
import typings.three.anon.Diffuse
import typings.three.anon.DisplacementBias
import typings.three.anon.EmissiveMap
import typings.three.anon.EnvMap
import typings.three.anon.FogColor
import typings.three.anon.GradientMap
import typings.three.anon.LightMap
import typings.three.anon.MetalnessMap
import typings.three.anon.NormalMap
import typings.three.anon.RoughnessMap
import typings.three.anon.SpecularMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aomap extends js.Object {
  var aomap: AoMap
  var bumpmap: BumpMap
  var common: AlphaMap
  var displacementmap: DisplacementBias
  var emissivemap: EmissiveMap
  var envmap: EnvMap
  var fog: FogColor
  var gradientmap: GradientMap
  var lightmap: LightMap
  var lights: AmbientLightColor
  var metalnessmap: MetalnessMap
  var normalmap: NormalMap
  var points: Diffuse
  var roughnessmap: RoughnessMap
  var specularmap: SpecularMap
}

object Aomap {
  @scala.inline
  def apply(
    aomap: AoMap,
    bumpmap: BumpMap,
    common: AlphaMap,
    displacementmap: DisplacementBias,
    emissivemap: EmissiveMap,
    envmap: EnvMap,
    fog: FogColor,
    gradientmap: GradientMap,
    lightmap: LightMap,
    lights: AmbientLightColor,
    metalnessmap: MetalnessMap,
    normalmap: NormalMap,
    points: Diffuse,
    roughnessmap: RoughnessMap,
    specularmap: SpecularMap
  ): Aomap = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aomap]
  }
}

