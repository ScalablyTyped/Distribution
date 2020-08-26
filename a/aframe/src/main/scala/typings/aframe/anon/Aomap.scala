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

@js.native
trait Aomap extends js.Object {
  var aomap: AoMap = js.native
  var bumpmap: BumpMap = js.native
  var common: AlphaMap = js.native
  var displacementmap: DisplacementBias = js.native
  var emissivemap: EmissiveMap = js.native
  var envmap: EnvMap = js.native
  var fog: FogColor = js.native
  var gradientmap: GradientMap = js.native
  var lightmap: LightMap = js.native
  var lights: AmbientLightColor = js.native
  var metalnessmap: MetalnessMap = js.native
  var normalmap: NormalMap = js.native
  var points: Diffuse = js.native
  var roughnessmap: RoughnessMap = js.native
  var specularmap: SpecularMap = js.native
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
  @scala.inline
  implicit class AomapOps[Self <: Aomap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAomap(value: AoMap): Self = this.set("aomap", value.asInstanceOf[js.Any])
    @scala.inline
    def setBumpmap(value: BumpMap): Self = this.set("bumpmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon(value: AlphaMap): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplacementmap(value: DisplacementBias): Self = this.set("displacementmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmissivemap(value: EmissiveMap): Self = this.set("emissivemap", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvmap(value: EnvMap): Self = this.set("envmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFog(value: FogColor): Self = this.set("fog", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradientmap(value: GradientMap): Self = this.set("gradientmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightmap(value: LightMap): Self = this.set("lightmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setLights(value: AmbientLightColor): Self = this.set("lights", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetalnessmap(value: MetalnessMap): Self = this.set("metalnessmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalmap(value: NormalMap): Self = this.set("normalmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoints(value: Diffuse): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoughnessmap(value: RoughnessMap): Self = this.set("roughnessmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecularmap(value: SpecularMap): Self = this.set("specularmap", value.asInstanceOf[js.Any])
  }
  
}

