package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An observable set of style attributes for an overlay.
  */
trait StylesOverlayOptions
  extends StObject
     with OverlayOptions {
  
  var style: js.UndefOr[Style] = js.undefined
}
object StylesOverlayOptions {
  
  inline def apply(): StylesOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesOverlayOptions]
  }
  
  extension [Self <: StylesOverlayOptions](x: Self) {
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
