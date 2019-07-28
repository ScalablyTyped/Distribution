package typings.aframe

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcRenderersShadersShaderLibMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends /* name */ StringDictionary[Shader] {
  var basic: Shader
  var cube: Shader
  var dashed: Shader
  var depth: Shader
  var depthRGBA: Shader
  var distanceRGBA: Shader
  var equirect: Shader
  var lambert: Shader
  var normal: Shader
  var phong: Shader
  var physical: Shader
  var points: Shader
  var standard: Shader
}

object Anon_Basic {
  @scala.inline
  def apply(
    basic: Shader,
    cube: Shader,
    dashed: Shader,
    depth: Shader,
    depthRGBA: Shader,
    distanceRGBA: Shader,
    equirect: Shader,
    lambert: Shader,
    normal: Shader,
    phong: Shader,
    physical: Shader,
    points: Shader,
    standard: Shader,
    StringDictionary: /* name */ StringDictionary[Shader] = null
  ): Anon_Basic = {
    val __obj = js.Dynamic.literal(basic = basic, cube = cube, dashed = dashed, depth = depth, depthRGBA = depthRGBA, distanceRGBA = distanceRGBA, equirect = equirect, lambert = lambert, normal = normal, phong = phong, physical = physical, points = points, standard = standard)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Basic]
  }
}

