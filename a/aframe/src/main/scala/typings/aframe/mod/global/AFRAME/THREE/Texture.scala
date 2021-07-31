package typings.aframe.mod.global.AFRAME.THREE

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.Texture")
@js.native
class Texture protected ()
  extends typings.three.mod.Texture {
  /**
  	 * @param [image]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
  def this(
    image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[TextureEncoding]
  ) = this()
}
