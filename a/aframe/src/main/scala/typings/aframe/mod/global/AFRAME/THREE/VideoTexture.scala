package typings.aframe.mod.global.AFRAME.THREE

import typings.std.HTMLVideoElement
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.VideoTexture")
@js.native
class VideoTexture protected ()
  extends typings.three.mod.VideoTexture {
  /**
  	 * @param video
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearFilter]
  	 * @param [format=THREE.RGBFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [anisotropy=1]
  	 */
  def this(
    video: HTMLVideoElement,
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
