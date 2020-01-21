package typings.aframe

import org.scalablytyped.runtime.StringDictionary
import typings.three.shaderLibMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends /* name */ StringDictionary[Shader] {
  var background: Shader
  var basic: Shader
  var cube: Shader
  var dashed: Shader
  var depth: Shader
  var distanceRGBA: Shader
  var equirect: Shader
  var lambert: Shader
  var matcap: Shader
  var normal: Shader
  var phong: Shader
  var physical: Shader
  var points: Shader
  var shadow: Shader
  var sprite: Shader
  var standard: Shader
}

object AnonBackground {
  @scala.inline
  def apply(
    background: Shader,
    basic: Shader,
    cube: Shader,
    dashed: Shader,
    depth: Shader,
    distanceRGBA: Shader,
    equirect: Shader,
    lambert: Shader,
    matcap: Shader,
    normal: Shader,
    phong: Shader,
    physical: Shader,
    points: Shader,
    shadow: Shader,
    sprite: Shader,
    standard: Shader,
    StringDictionary: /* name */ StringDictionary[Shader] = null
  ): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], basic = basic.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], dashed = dashed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], distanceRGBA = distanceRGBA.asInstanceOf[js.Any], equirect = equirect.asInstanceOf[js.Any], lambert = lambert.asInstanceOf[js.Any], matcap = matcap.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], phong = phong.asInstanceOf[js.Any], physical = physical.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonBackground]
  }
}

