package typings.ansiEscapes.mod

import typings.ansiEscapes.ansiEscapesStrings.auto
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOptions extends js.Object {
  
  /**
  		The height is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val height: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
  
  val preserveAspectRatio: js.UndefOr[Boolean] = js.native
  
  /**
  		The width is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val width: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
}
object ImageOptions {
  
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: LiteralUnion[auto, Double | String]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setWidth(value: LiteralUnion[auto, Double | String]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
