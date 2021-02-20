package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attributes used when initializing a tile overlay, including minimum and
  * maximum zoom, opacity, and custom data.
  */
@js.native
trait TileOverlayConstructorOptions extends StObject {
  
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.UndefOr[js.Object] = js.native
  
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: js.UndefOr[Double] = js.native
  
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: js.UndefOr[Double] = js.native
  
  /**
    * Opacity level of the overlay.
    */
  var opacity: js.UndefOr[Double] = js.native
}
object TileOverlayConstructorOptions {
  
  @scala.inline
  def apply(): TileOverlayConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOverlayConstructorOptions]
  }
  
  @scala.inline
  implicit class TileOverlayConstructorOptionsMutableBuilder[Self <: TileOverlayConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZUndefined: Self = StObject.set(x, "maximumZ", js.undefined)
    
    @scala.inline
    def setMinimumZ(value: Double): Self = StObject.set(x, "minimumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumZUndefined: Self = StObject.set(x, "minimumZ", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
