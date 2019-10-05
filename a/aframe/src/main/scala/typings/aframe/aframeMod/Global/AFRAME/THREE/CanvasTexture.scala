package typings.aframe.aframeMod.Global.AFRAME.THREE

import typings.std.HTMLImageElement
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.CanvasTexture")
@js.native
class CanvasTexture protected ()
  extends typings.three.threeMod.CanvasTexture {
  def this(
    canvas: HTMLImageElement,
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

