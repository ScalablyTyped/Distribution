package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
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
  implicit class StylesOverlayOptionsMutableBuilder[Self <: StylesOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
