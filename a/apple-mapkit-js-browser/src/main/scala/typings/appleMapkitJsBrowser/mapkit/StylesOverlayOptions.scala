package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An observable set of style attributes for an overlay.
  */
@js.native
trait StylesOverlayOptions extends OverlayOptions {
  
  var style: js.UndefOr[Style] = js.native
}
object StylesOverlayOptions {
  
  @scala.inline
  def apply(): StylesOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesOverlayOptions]
  }
  
  @scala.inline
  implicit class StylesOverlayOptionsOps[Self <: StylesOverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
