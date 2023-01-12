package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
trait TileOverlay extends StObject {
  
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.Object
  
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: Double
  
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: Double
  
  /**
    * Opacity level of the overlay.
    */
  var opacity: Double
  
  /**
    * Reloads the tile overlay for the displayed map region with the latest
    * data values.
    */
  def reload(): Unit
  
  /**
    * A string, or callback function that returns a string, with a URL that
    * provides the requested tile.
    */
  var urlTemplate: String | URLTemplateCallback
}
object TileOverlay {
  
  inline def apply(
    data: js.Object,
    maximumZ: Double,
    minimumZ: Double,
    opacity: Double,
    reload: () => Unit,
    urlTemplate: String | URLTemplateCallback
  ): TileOverlay = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maximumZ = maximumZ.asInstanceOf[js.Any], minimumZ = minimumZ.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOverlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileOverlay] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
    
    inline def setMinimumZ(value: Double): Self = StObject.set(x, "minimumZ", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    inline def setUrlTemplate(value: String | URLTemplateCallback): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    inline def setUrlTemplateFunction5(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* scale */ Double, /* data */ js.Object) => String
    ): Self = StObject.set(x, "urlTemplate", js.Any.fromFunction5(value))
  }
}
