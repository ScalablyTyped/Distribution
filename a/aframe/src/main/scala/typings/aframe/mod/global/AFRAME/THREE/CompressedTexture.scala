package typings.aframe.mod.global.AFRAME.THREE

import typings.std.ImageData
import typings.three.constantsMod.CompressedPixelFormat
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typings.three.mod.CompressedTexture {
  /**
  	 * @param mipmaps
  	 * @param width
  	 * @param height
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
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
