package typings.aframe.aframeMod.THREE

import typings.std.ImageData
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typings.three.threeMod.CompressedTexture {
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[CompressedPixelFormat],
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[TextureEncoding]
  ) = this()
}

