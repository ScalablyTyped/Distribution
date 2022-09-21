package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable10
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.three.mod.Texture
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTexture
  extends StObject
     with Instantiable10[
      /* image */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      Texture
    ] {
  
  var DEFAULT_IMAGE: Any = js.native
  
  var DEFAULT_MAPPING: Any = js.native
}
